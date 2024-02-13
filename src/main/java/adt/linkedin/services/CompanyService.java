package adt.linkedin.services;

import adt.linkedin.implementations.CompanyImplDAO;
import adt.linkedin.model.*;

import java.awt.event.ComponentAdapter;

public class CompanyService {
    CompanyImplDAO controller = new CompanyImplDAO();

    public void createCompany(Company company){
        controller.createCompany(company);
    }
    public void removeCompany(Company company){
        controller.removeCompany(company);
    }
    public Company createCompany(String name){//por que devuelve company -> para trabajar con ella mas adelante
        Company c = new Company(name, null);
        controller.createCompany(c);
        return controller.getCompany(c.getId());
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
    public Company createCompany(String name, String description){
        controller.createCompany(new Company(name, description));
        return controller.getCompanyByName(name);
    }
    public void addJobOffer(Company company, JobOffer offer){
        company.getOffers().add(offer);
        offer.setCompany(company); //MAÑANA
        controller.updateCompany(company);
    }
}
