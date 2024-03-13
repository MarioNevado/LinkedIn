package adt.linkedin.dao;

import adt.linkedin.model.JobOffer;

public interface JobOfferDAO {
    public void createOffer(JobOffer offer);
    public void updateOffer(JobOffer offer);
    public void removeOffer(JobOffer offer);
    
}
