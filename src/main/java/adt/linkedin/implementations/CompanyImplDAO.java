package adt.linkedin.implementations;

import adt.linkedin.dao.CompanyDAO;
import adt.linkedin.model.Candidature;
import adt.linkedin.model.Company;
import adt.linkedin.model.JobOffer;
import adt.linkedin.utils.HibernateUtil;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class CompanyImplDAO implements CompanyDAO {
    @Override
    public Company getCompanyByName(String name) { //UNIQUE en nombre?
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            CriteriaBuilder cb = session.getCriteriaBuilder();
            CriteriaQuery<Company> cQuery = cb.createQuery(Company.class);
            Root<Company> root = cQuery.from(Company.class);
            cQuery.select(root).where(cb.equal(root.get("name"), name));
            Query<Company> query = session.createQuery(cQuery);
            return query.getSingleResult();
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Candidature> getCandidaturesByJobOffer(Company company, JobOffer offer) { // join?
        return null;
    }

    @Override
    public void updateCompany(Company company) {
        Transaction tx = null;
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            if (company != null){
                tx = session.beginTransaction();
                session.merge(company);
                tx.commit();
            }
        }catch(Exception e){
            if (tx != null) tx.rollback();
            e.printStackTrace();
        }
    }

    @Override
    public List<JobOffer> getJobOffers(Company company) {
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            CriteriaBuilder cb = session.getCriteriaBuilder();
            CriteriaQuery<JobOffer> cQuery = cb.createQuery(JobOffer.class);
            Root<Company> root = cQuery.from(Company.class);
            cQuery.select(root.get("offers")).where(cb.equal(root.get("id"),company.getId()));
            Query<JobOffer> query = session.createQuery(cQuery);
            return query.list();
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void removeCompany(Company company) {
        Transaction tx = null;
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            if (company != null){
                tx = session.beginTransaction();
                session.remove(company);
                tx.commit();
            }
        }catch(Exception e){
            if (tx != null) tx.rollback();
            e.printStackTrace();
        }
    }

    @Override
    public void createCompany(Company company) {
        Transaction tx = null;
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            if (company != null){
                tx = session.beginTransaction();
                session.persist(company);
                tx.commit();
            }
        }catch(Exception e){
            if (tx != null) tx.rollback();
            e.printStackTrace();
        }
    }

    @Override
    public Company getCompany(long id) {
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            CriteriaBuilder cb = session.getCriteriaBuilder();
            CriteriaQuery<Company> cQuery = cb.createQuery(Company.class);
            Root<Company> root = cQuery.from(Company.class);
            cQuery.select(root).where(cb.equal(root.get("id"), id));
            Query<Company> query = session.createQuery(cQuery);
            return query.getSingleResult();
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
