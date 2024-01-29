package adt.linkedin.implementations;

import adt.linkedin.dao.UserDAO;
import adt.linkedin.model.*;
import adt.linkedin.utils.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class UserImplDAO implements UserDAO {
    @Override
    public List<AcademicInfo> getUserAcademicInfo(User user) {
        return null;
    }

    @Override
    public void removeUser(User user) {
        Transaction tx = null;
        try(Session session  = HibernateUtil.getSessionFactory().openSession()){
            if (user != null){
                tx = session.beginTransaction();
                session.remove(user);
                tx.commit();
            }
        }catch (Exception e){
            if(tx != null){
                tx.rollback();
            }
            e.printStackTrace();
        }
    }

    @Override
    public User getUser(long id) {
        return null;
    }

    @Override
    public List<Skill> getUserSkills(User user) {
        return null;
    }

    @Override
    public List<Candidature> getUserCandidatures(User user) {
        return null;
    }

    @Override
    public List<User> getUsersByName(String name) {
        return null;
    }

    @Override
    public void updateUser(User user) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.merge(user);
            transaction.commit();
        } catch (HibernateException h) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new HibernateException("Error actualizando");
        }
    }

    @Override
    public void createUser(User user) {
        Transaction tx = null;
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            if (user != null){
                tx = session.beginTransaction();
                session.persist(user);
                tx.commit();
            }else throw new HibernateException("El producto está vacío");
        }catch(Exception e){
            if(tx != null){
                tx.rollback();
            }
            e.printStackTrace();
        }
    }

    @Override
    public List<WorkExperience> getUserLaboralExperience(User user) {
        return null;
    }

    @Override
    public User getUserByName(String name) {
        return null;
    }
}
