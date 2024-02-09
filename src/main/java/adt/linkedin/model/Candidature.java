package adt.linkedin.model;

import adt.linkedin.enumerations.Status;
import jakarta.persistence.*;
import org.checkerframework.checker.units.qual.C;

import java.util.ArrayList;
import java.util.List;

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
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "candidature")
    private List<JobOffer> offers = new ArrayList<>();

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

    public List<JobOffer> getOffers() {
        return offers;
    }
    public void setOffers(List<JobOffer> offers) {
        this.offers = offers;
    }

    @Override
    public String toString() {
        return "Candidature{" +
                "id=" + id +
                ", status=" + status +
                ", cvPath='" + cvPath + '\'' +
                ", coverLetterPath='" + coverLetterPath + '\'' +
                ", user=" + user +
                ", offers=" + offers +
                '}';
    }
}
