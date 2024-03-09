package adt.linkedin.model;

import adt.linkedin.enumerations.Status;
import jakarta.persistence.*;
import org.checkerframework.checker.units.qual.C;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "candidatures")
public class Candidature {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "status")
    private Status status;
    @Column(name = "cv_path")
    private String cvPath;
    @Column(name = "cover_letter_path")
    private String coverLetterPath;
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "job_offer_id", nullable = false)
    private JobOffer offer;

    public Candidature() {
    }

    public Candidature(String cvPath, String coverLetterPath) {
        this.cvPath = cvPath;
        this.coverLetterPath = coverLetterPath;
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getCvPath() {
        return cvPath;
    }

    public void setCvPath(String cvPath) {
        this.cvPath = cvPath;
    }

    public String getCoverLetterPath() {
        return coverLetterPath;
    }

    public void setCoverLetterPath(String coverLetterPath) {
        this.coverLetterPath = coverLetterPath;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public JobOffer getOffers() {
        return offer;
    }
    public void setOffer(JobOffer offer) {
        this.offer = offer;
    }

    @Override
    public String toString() {
        return "Candidature{" +
                "id=" + id +
                ", status=" + status +
                ", cvPath='" + cvPath + '\'' +
                ", coverLetterPath='" + coverLetterPath + '\'' +
                ", user=" + user;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Candidature other = (Candidature) obj;
        if (this.status != other.status) {
            return false;
        }
        if (!Objects.equals(this.user, other.user)) {
            return false;
        }
        if (!Objects.equals(this.offer.getCompany().getName(), other.getOffers().getCompany().getName())) {
            return false;
        }
        if (!Objects.equals(this.offer.getLocation(), other.getOffers().getLocation())) {
            return false;
        }
        return Objects.equals(this.offer.getTitle(), other.offer.getTitle());
    }    
}
