package adt.linkedin.services;

import adt.linkedin.implementations.CompanyImplDAO;
import adt.linkedin.model.*;
import adt.linkedin.tools.HibernateUtil;
import jakarta.persistence.NoResultException;
import jakarta.persistence.criteria.*;

import java.awt.event.ComponentAdapter;
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
    public Company createCompany(String name){
        Company c = new Company(name, null, null);
        controller.createCompany(c);
        return controller.getCompany(c.getId());
    }
    public Company getCompany(String name){
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            CriteriaBuilder cb = session.getCriteriaBuilder();
            CriteriaQuery <Company> cQuery = cb.createQuery(Company.class);
            Root <Company> root = cQuery.from(Company.class);
            cQuery.where(cb.equal(root.get("name"), name));
            Query<Company> query = session.createQuery(cQuery);
            return query.getSingleResult();
        }catch(NoResultException nre){
            return null;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
    public List<Company> getCompanies(String name){
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            CriteriaBuilder cb = session.getCriteriaBuilder();
            CriteriaQuery <Company> cQuery = cb.createQuery(Company.class);
            Root <Company> root = cQuery.from(Company.class);
            cQuery.where(cb.like(root.get("name"), "%" + name + "%"));
            Query<Company> query = session.createQuery(cQuery);
            return query.list();
        }catch(NoResultException nre){
            return null;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
    
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
        offer.setCompany(company); //MAÑANA
        controller.updateCompany(company);
    }
}
