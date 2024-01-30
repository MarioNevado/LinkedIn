package adt.linkedin.services;

import adt.linkedin.implementations.CompanyImplDAO;
import adt.linkedin.model.Company;
import adt.linkedin.model.JobOffer;
import org.checkerframework.checker.units.qual.C;

public class CompanyService {
    CompanyImplDAO controller = new CompanyImplDAO();

    void createCompany(Company company){
        controller.createCompany(company);
    }
    void removeCompany(Company company){
        controller.removeCompany(company);
    }
    Company createCompany(String name){//por que devuelve company -> para trabajar con ella mas adelante
        return null;
    }
    void printCompanyInfo(Company company){

    }
    Company createCompany(String name, String description){
        return null;
    }
    void addJobOffer(Company company, JobOffer offer){
        company.getOffers().add(offer);
        controller.updateCompany(company);
    }
}
