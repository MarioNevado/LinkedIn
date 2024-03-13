package adt.linkedin.implementations;

import adt.linkedin.dao.JobOfferDAO;
import adt.linkedin.model.JobOffer;
import adt.linkedin.tools.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class JobOfferImplDAO implements JobOfferDAO{

    @Override
    public void createOffer(JobOffer offer) {
        Transaction tx = null;
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            if (offer != null){
                tx = session.beginTransaction();
                session.persist(offer);
                tx.commit();
            }
        }catch(Exception e){
            if (tx != null){
                tx.rollback();
            }
        }
    }

    @Override
    public void updateOffer(JobOffer offer) {
        Transaction tx = null;
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            if (offer != null){
                tx = session.beginTransaction();
                session.merge(offer);
                tx.commit();
            }
        }catch(Exception e){
            if (tx != null){
                tx.rollback();
            }
        }
    }

    @Override
    public void removeOffer(JobOffer offer) {
        Transaction tx = null;
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            if (offer != null){
                tx = session.beginTransaction();
                session.remove(offer);
                tx.commit();
            }
        }catch(Exception e){
            if (tx != null){
                tx.rollback();
            }
        }
    }

}
