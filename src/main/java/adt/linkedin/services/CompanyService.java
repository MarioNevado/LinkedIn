package adt.linkedin.services;

import adt.linkedin.enumerations.Status;
import adt.linkedin.implementations.CompanyImplDAO;
import adt.linkedin.model.*;
import adt.linkedin.tools.HibernateUtil;
import jakarta.persistence.NoResultException;
import jakarta.persistence.criteria.*;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.query.Query;

public class CompanyService {
    CompanyImplDAO controller = new CompanyImplDAO();

    public void createCompany(Company company){
        controller.createCompany(company);
    }
    public void updateCompany(Company company){
        controller.updateCompany(company);
    }
    public void removeCompany(Company company){
        controller.removeCompany(company);
    }
    /**
     * Crea la empresa únicamente con el nombre y una contraseña por defecto
     * @param name nombre de la empresa
     * @return la misma compañia
     */
    public Company createCompany(String name){
        Company c = new Company(name, name + "1234", null);
        controller.createCompany(c);
        return controller.getCompany(c.getId());
    }
    
    /**
     * Obtiene la empresa por nombre, que es único
     * @param name nombre de la empresa
     * @return la empresa
     */
    public Company getCompany(String name){
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            CriteriaBuilder cb = session.getCriteriaBuilder();
            CriteriaQuery <Company> cQuery = cb.createQuery(Company.class);
            Root <Company> root = cQuery.from(Company.class);
            cQuery.where(cb.equal(root.get("name"), name));
            Query<Company> query = session.createQuery(cQuery);
            return query.getSingleResult();
        
        }catch(Exception e){
            return null;
        }
    }
    
    /**
     * Obtiene compañía o compañías que en su nombre contengan la cadena de texto
     * @param name cadena de texto que las empresas deberán contenter
     * @return lista de todas las coincidencias
     */
    public List<Company> getCompanies(String name){
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            CriteriaBuilder cb = session.getCriteriaBuilder();
            CriteriaQuery <Company> cQuery = cb.createQuery(Company.class);
            Root <Company> root = cQuery.from(Company.class);
            cQuery.where(cb.like(root.get("name"), "%" + name + "%"));
            Query<Company> query = session.createQuery(cQuery);
            return query.list();
        }catch(Exception e){
            return null;
        }
    }
    
    /**
     * Muestra por pantalla la información de la empresa
     * @param company empresa de la que queremos obtener la información
     */
    public void printCompanyInfo(Company company){
        company = controller.getCompany(company.getId());
        System.out.println("Compañía: " + company);
        for (WorkExperience experience: company.getExperiences()){
            System.out.println(experience);
        }
        for (JobOffer offer : company.getOffers()){
            System.out.println(offer);
        }
    }
    
    public Company createCompany(String name, String password, String description){
        controller.createCompany(new Company(name, password, description));
        return controller.getCompanyByName(name);
    }
    
    public void addJobOffer(Company company, JobOffer offer){
        company.getOffers().add(offer);
        offer.setCompany(company);
        controller.updateCompany(company);
    }
    
    public void acceptCandidature(Company company,JobOffer offer, Candidature candidature, int selectedRow){
        company.getOffers().remove(offer);
        offer.getCandidatures().remove(candidature);
        candidature.setStatus(Status.ACCEPTED);
        offer.getCandidatures().add(candidature);
        company.getOffers().add(offer);
        updateCompany(company);
        
    }
    
    public void rejectCandidature(Company company,JobOffer offer, Candidature candidature){
        company.getOffers().remove(offer);
        offer.getCandidatures().get(offer.getCandidatures().indexOf(candidature)).setStatus(Status.REJECTED);
        company.getOffers().add(offer);
        updateCompany(company);
        
    }
}
