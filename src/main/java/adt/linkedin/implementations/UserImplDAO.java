package adt.linkedin.implementations;

import adt.linkedin.dao.UserDAO;
import adt.linkedin.model.*;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class UserImplDAO implements UserDAO {

    private final Session session;

    public UserImplDAO(Session session) {
        this.session = session;
    }

    @Override
    public void removeUser(User user) {
        Transaction tx = null;
        try {
            if (user != null) {
                tx = session.beginTransaction();
                session.remove(user);
                tx.commit();
            }
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            if (session.isOpen()) {
                session.close();
            }
            e.printStackTrace();
        }
    }

    @Override
    public void updateUser(User user) {
        Transaction transaction = null;
        try {
            if (user != null) {
                transaction = session.beginTransaction();
                session.merge(user);
                transaction.commit();
            }
        } catch (HibernateException h) {
            h.printStackTrace();
            if (transaction != null) {
                transaction.rollback();
            }
            if (session.isOpen()) {
                session.close();
            }
            throw new HibernateException("Error actualizando");
        }
    }

    @Override
    public void createUser(User user) {
        Transaction tx = null;
        try {
            if (user != null) {
                tx = session.beginTransaction();
                session.persist(user);
                tx.commit();
            } else {
                throw new HibernateException("El producto está vacío");
            }
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            if (session.isOpen()) {
                session.close();
            }
            e.printStackTrace();
        }
    }

}
