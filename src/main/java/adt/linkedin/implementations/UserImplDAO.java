package adt.linkedin.implementations;

import adt.linkedin.dao.UserDAO;
import adt.linkedin.model.*;
import adt.linkedin.tools.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class UserImplDAO implements UserDAO {
    /*
    SELECT * from academic_info ai
join users u
on ai.user_id = u.id ;
     */
   
    @Override
    public void removeUser(User user) {
        Transaction tx = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            if (user != null) {
                tx = session.beginTransaction();
                session.remove(user);
                tx.commit();
            }
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        }
    }
    
    @Override
    public void updateUser(User user) {
        System.out.println("USUARIO" +user);
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            if (user != null) {
                transaction = session.beginTransaction();
                session.merge(user);
                transaction.commit();
            }else System.out.println("Usuario Nulo");
        } catch (HibernateException h) {
            h.printStackTrace();
            if (transaction != null) transaction.rollback();
            throw new HibernateException("Error actualizando");
        }
    }
    
    @Override
    public void createUser(User user) {
        Transaction tx = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            if (user != null) {
                tx = session.beginTransaction();
                session.persist(user);
                tx.commit();
            } else throw new HibernateException("El producto está vacío");
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        }
    }
    
}
    
