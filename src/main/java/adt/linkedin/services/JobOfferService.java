package adt.linkedin.services;

import adt.linkedin.converters.WorkDayTypeConverter;
import adt.linkedin.enumerations.WorkDayType;
import adt.linkedin.implementations.JobOfferImplDAO;
import adt.linkedin.model.Candidature;
import adt.linkedin.model.Company;
import adt.linkedin.model.JobOffer;
import adt.linkedin.model.Skill;
import adt.linkedin.model.User;
import adt.linkedin.tools.HibernateUtil;
import jakarta.persistence.NoResultException;
import jakarta.persistence.criteria.*;
import jakarta.persistence.criteria.CriteriaQuery;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.query.Query;

public class JobOfferService {
    JobOfferImplDAO controller = new JobOfferImplDAO();
    WorkDayTypeConverter converter = new WorkDayTypeConverter();
    
    public void createOffer(JobOffer offer) {
        controller.createOffer(offer);
    }
    
    public void updateOffer(JobOffer offer) {
        controller.updateOffer(offer);
    }
    
    public void removeOffer(JobOffer offer) {
        controller.removeOffer(offer);
    }
    
    public List<Candidature> getCandidatures(JobOffer offer){
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            CriteriaBuilder cb = session.getCriteriaBuilder();
            CriteriaQuery <Candidature> cQuery = cb.createQuery(Candidature.class);
            Root<JobOffer> root = cQuery.from(JobOffer.class);
            Join<JobOffer, Candidature> join = root.join("candidatures");
            cQuery.where(cb.equal(root, offer));
            Query<Candidature> query = session.createQuery(cQuery.select(join));
            return query.list();
        }catch(NoResultException no){
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
    
    public List<JobOffer> getOffersBySkill(Skill skill){
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            CriteriaBuilder cb = session.getCriteriaBuilder();
            CriteriaQuery <JobOffer> cQuery = cb.createQuery(JobOffer.class);
            Root<JobOffer> root = cQuery.from(JobOffer.class);
            Join<JobOffer, Skill> join = root.join("skills");
            cQuery.where(cb.equal(join, skill));
            Query<JobOffer> query = session.createQuery(cQuery);
            return query.list();
        }catch(NoResultException no){
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
    
    public List<JobOffer> getOffersBySkill(String name){
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            CriteriaBuilder cb = session.getCriteriaBuilder();
            CriteriaQuery <JobOffer> cQuery = cb.createQuery(JobOffer.class);
            Root<JobOffer> root = cQuery.from(JobOffer.class);
            Join<JobOffer, Skill> join = root.join("skills");
            cQuery.where(cb.equal(join.get("name"), name));
            Query<JobOffer> query = session.createQuery(cQuery);
            return query.list();
        }catch(NoResultException no){
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
    
    public List<JobOffer> getOffersByWorkDayType(WorkDayType type){
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            CriteriaBuilder cb = session.getCriteriaBuilder();
            CriteriaQuery <JobOffer> cQuery = cb.createQuery(JobOffer.class);
            Root<JobOffer> root = cQuery.from(JobOffer.class);
            cQuery.where(cb.equal(root.get("workday_type"), converter.convertToDataBaseColumn(type)));
            Query<JobOffer> query = session.createQuery(cQuery);
            return query.list();
        }catch(NoResultException no){
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
    
    public List<JobOffer> getOffersByTitle(String title){
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            CriteriaBuilder cb = session.getCriteriaBuilder();
            CriteriaQuery <JobOffer> cQuery = cb.createQuery(JobOffer.class);
            Root<JobOffer> root = cQuery.from(JobOffer.class);
            cQuery.where(cb.equal(root.get("title"),title));
            Query<JobOffer> query = session.createQuery(cQuery);
            return query.list();
        }catch(NoResultException no){
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
    
    public List<JobOffer> getOffersBySalary(int minSalary){
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            CriteriaBuilder cb = session.getCriteriaBuilder();
            CriteriaQuery <JobOffer> cQuery = cb.createQuery(JobOffer.class);
            Root<JobOffer> root = cQuery.from(JobOffer.class);
            cQuery.where(cb.greaterThan(root.get("minSalary"), minSalary));
            Query<JobOffer> query = session.createQuery(cQuery);
            return query.list();
        }catch(NoResultException no){
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
    
    public JobOffer getOffer(long id){
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            CriteriaBuilder cb = session.getCriteriaBuilder();
            CriteriaQuery <JobOffer> cQuery = cb.createQuery(JobOffer.class);
            Root<JobOffer> root = cQuery.from(JobOffer.class);
            cQuery.where(cb.equal(root, id));
            Query<JobOffer> query = session.createQuery(cQuery);
            return query.getSingleResult();
        }catch(NoResultException no){
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
    
    public List<JobOffer> getOffersByCompany(Company company){
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            CriteriaBuilder cb = session.getCriteriaBuilder();
            CriteriaQuery <JobOffer> cQuery = cb.createQuery(JobOffer.class);
            Root<JobOffer> root = cQuery.from(JobOffer.class);
            cQuery.where(cb.equal(root.get("companies_id"), company));
            Query<JobOffer> query = session.createQuery(cQuery);
            return query.list();
        }catch(NoResultException no){
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
    
    public List<JobOffer> getOffersByLocation(String location){
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            CriteriaBuilder cb = session.getCriteriaBuilder();
            CriteriaQuery <JobOffer> cQuery = cb.createQuery(JobOffer.class);
            Root<JobOffer> root = cQuery.from(JobOffer.class);
            cQuery.where(cb.equal(root.get("location"), location));
            Query<JobOffer> query = session.createQuery(cQuery);
            return query.list();
        }catch(NoResultException no){
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
    
    public List<Candidature> getCandidaturesByUser(User user){
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            CriteriaBuilder cb = session.getCriteriaBuilder();
            CriteriaQuery<Candidature> cQuery = cb.createQuery(Candidature.class);
            Root<JobOffer> root = cQuery.from(JobOffer.class);
            Join<JobOffer, Candidature> join = root.join("candidatures");
            cQuery.where(cb.equal(join.get("user_id"), user));
            Query <Candidature> query = session.createQuery(cQuery.select(join));
            return query.list();
        }catch(NoResultException no){
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
    
    public void closeJobOffer(JobOffer offer){
        offer.setOpen(false);
        updateOffer(offer);
    }
    
    public void createJobOffer(String title, Company company){
        JobOffer offer = new JobOffer(title, null);
        offer.setCompany(company);
        createOffer(offer);
    }
    
    

    
}
