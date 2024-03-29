package adt.linkedin.model;

import adt.linkedin.enumerations.WorkDayType;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "job_offer")
public class JobOffer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "min_salary")
    private int minSalary;
    @Column(name = "max_salary")
    private int maxSalary;
    @Column(name = "open")
    private boolean open;
    @Column(name = "required_candidates")
    private int requiredCandidates;
    @Column(name = "workday_type")
    private WorkDayType workDayType;
    @Column(name = "title")
    private String title;
    @Column(name = "location")
    private String location;
    @Column(name = "details")
    private String details;
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    @JoinColumn(name = "companies_id", nullable = false)
    private Company company;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "offers_skills", joinColumns = @JoinColumn(name = "job_offer_id"), inverseJoinColumns = @JoinColumn(name = "skill_id"))
    private List<Skill> skills = new ArrayList<>();
    @OneToMany(cascade = {CascadeType.PERSIST,  CascadeType.REMOVE}, fetch = FetchType.EAGER, mappedBy = "offer")
    private List<Candidature> candidatures = new ArrayList<>();
    public JobOffer() {
    }
    public JobOffer(String title, String location) {
        this.title = title;
        this.location = location;
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(int minSalary) {
        this.minSalary = minSalary;
    }

    public int getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(int maxSalary) {
        this.maxSalary = maxSalary;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public int getRequiredCandidates() {
        return requiredCandidates;
    }

    public void setRequiredCandidates(int requiredCandidates) {
        if (this.requiredCandidates >= 1) {
            this.requiredCandidates = requiredCandidates;
        }else this.requiredCandidates = 0;
        
    }

    public WorkDayType getWorkDayType() {
        return workDayType;
    }

    public void setWorkDayType(WorkDayType workDayType) {
        this.workDayType = workDayType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    public List<Candidature> getCandidatures() {
        return candidatures;
    }

    public void setCandidatures(List<Candidature> candidature) {
        this.candidatures = candidature;
    }

    @Override
    public String toString() {
        return title + " " + company.getName() + " " + location + " " + workDayType + " " + minSalary;
    }

    @Override
    public int hashCode() {
        int hash = 3;
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
        final JobOffer other = (JobOffer) obj;
        if (this.minSalary != other.minSalary) {
            return false;
        }
        if (this.open != other.open) {
            return false;
        }
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        return Objects.equals(this.location, other.location);
    }
    
    
}
