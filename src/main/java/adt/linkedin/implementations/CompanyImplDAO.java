package adt.linkedin.implementations;

import adt.linkedin.dao.CompanyDAO;
import adt.linkedin.model.*;
import adt.linkedin.tools.HibernateUtil;
import jakarta.persistence.criteria.*;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class CompanyImplDAO implements CompanyDAO {
    @Override
    public Company getCompanyByName(String name) { 
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            CriteriaBuilder cb = session.getCriteriaBuilder();
            CriteriaQuery<Company> cQuery = cb.createQuery(Company.class);
            Root<Company> root = cQuery.from(Company.class);
            cQuery.select(root).where(cb.equal(root.get("name"), name));
            Query<Company> query = session.createQuery(cQuery);
            return query.getSingleResult();
        }catch(Exception e){
            
        }
        return null;
    }

    @Override
    public List<Candidature> getCandidaturesByJobOffer(Company company, JobOffer offer) {
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            CriteriaBuilder cb = session.getCriteriaBuilder();
            CriteriaQuery<Candidature> cQuery = cb.createQuery(Candidature.class);
            Root<Candidature> root = cQuery.from(Candidature.class);
            Join<Candidature, JobOffer> join1 = root.join("offers");
            Join<JobOffer, Company> join2 = join1.join("company");
            cQuery.where(cb.equal(join2, root));
            Query<Candidature> query = session.createQuery(cQuery);
            return query.list();
        }catch(Exception e){
        }

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
            if (tx != null){
                tx.rollback();
            }
            e.printStackTrace();
        }
    }

    /**
     * Obtiene las ofertas de trabajo según la empresa
     * @param company hace referencia a la compañia de la que queremos saber sus ofertas
     * @return Lista de ofertas de trabajo
     */
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
