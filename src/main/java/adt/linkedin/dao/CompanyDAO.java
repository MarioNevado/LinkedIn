package adt.linkedin.dao;

import adt.linkedin.model.Candidature;
import adt.linkedin.model.Company;
import adt.linkedin.model.JobOffer;

import java.util.List;

public interface CompanyDAO {
    Company getCompanyByName(String name);
    List<Candidature> getCandidaturesByJobOffer(Company company, JobOffer offer);
    void updateCompany(Company company);
    List<JobOffer> getJobOffers(Company company);
    void removeCompany(Company company);
    void createCompany(Company company);
    Company getCompany(long id);
}
