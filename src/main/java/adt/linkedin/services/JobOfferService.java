package adt.linkedin.services;

import adt.linkedin.converters.WorkDayTypeConverter;
import adt.linkedin.enumerations.WorkDayType;
import adt.linkedin.implementations.JobOfferImplDAO;
import adt.linkedin.model.*;
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
    
    /**
     * Obtiene todas las candidaturas de una oferta cuyo estado sea ACCEPTED
     * @param offer oferta de la que queremos sacar las candidaturas
     * @return Lista de candidaturas
     */
    public List<Candidature> getAcceptedCandidatures(JobOffer offer){
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            CriteriaBuilder cb = session.getCriteriaBuilder();
            CriteriaQuery <Candidature> cQuery = cb.createQuery(Candidature.class);
            Root<Candidature> root = cQuery.from(Candidature.class);
            Join<Candidature, JobOffer> join = root.join("offer");
            cQuery.where(cb.and(cb.equal(join, offer), cb.equal(root.get("status"), 2)));
            Query<Candidature> query = session.createQuery(cQuery.select(root));
            return query.list();
        }catch(Exception e){
        return null;
        }
        
    }
    
    /**
     * 
     * @param skill habilidad necesaria
     * @return Lista con todas las ofertas que requieran de esa skill
     */
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
    
    /**
     * 
     * @param type tipo de jornada
     * @return obtiene una lista de ofertas de trabajo con la jornada especificada
     */
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
            cQuery.where(cb.like(root.get("title"), "%" +title + ""));
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
            cQuery.where(cb.equal(root.get("id"), id));
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
            Join<JobOffer, Company> join = root.join("company");
            cQuery.where(cb.equal(join.get("id"), company.getId()));
            Query<JobOffer> query = session.createQuery(cQuery);
            return query.list();
        }catch(NoResultException no){
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
    
    /**
     * Busca la candidatura cuyo usario se llame de una específica manera y cuya oferta tenga determinado título
     * @param userName nombre del usuario
     * @param title título de la oferta
     * @return la candidatura si hay coincidencias
     */
    public Candidature getCandidatureByFields(String userName, String title){
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            CriteriaBuilder cb = session.getCriteriaBuilder();
            CriteriaQuery <Candidature> cQuery = cb.createQuery(Candidature.class);
            Root<Candidature> root = cQuery.from(Candidature.class);
            Join<Candidature, User> user = root.join("user");
            Join<Candidature, JobOffer> offer = root.join("offer");
            cQuery.where(cb.and(cb.equal(user.get("name"), userName), cb.equal(offer.get("title"), title)));
            Query<Candidature> query = session.createQuery(cQuery);
            return query.getSingleResult();
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
    
    public List<JobOffer> getOffers(){
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            CriteriaBuilder cb = session.getCriteriaBuilder();
            CriteriaQuery <JobOffer> cQuery = cb.createQuery(JobOffer.class);
            Root<JobOffer> root = cQuery.from(JobOffer.class);
            Query<JobOffer> query = session.createQuery(cQuery.select(root));
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
            cQuery.where(cb.equal(join.get("id"), user.getId()));
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
