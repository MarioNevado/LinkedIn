package adt.linkedin.dao;

import adt.linkedin.model.Candidature;
import adt.linkedin.model.JobOffer;
import java.util.List;

public interface JobOfferDAO {
    public void createOffer(JobOffer offer);
    public void updateOffer(JobOffer offer);
    public void removeOffer(JobOffer offer);
    
}
