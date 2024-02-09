package adt.linkedin.model;

import adt.linkedin.enumerations.WorkDayType;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

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
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "companies_id")
    private Company company;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "offers_skills", joinColumns = @JoinColumn(name = "job_offer_id"), inverseJoinColumns = @JoinColumn(name = "skill_id"))
    private List<Skill> skills = new ArrayList<>();
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "candidature_id", nullable = false)
    private Candidature candidature;
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
        this.requiredCandidates = requiredCandidates;
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

    public Candidature getCandidature() {
        return candidature;
    }

    public void setCandidature(Candidature candidature) {
        this.candidature = candidature;
    }

    @Override
    public String toString() {
        return "JobOffer{" +
                "id=" + id +
                ", minSalary=" + minSalary +
                ", maxSalary=" + maxSalary +
                ", open=" + open +
                ", requiredCandidates=" + requiredCandidates +
                ", workDayType=" + workDayType +
                ", title='" + title + '\'' +
                ", location='" + location + '\'' +
                ", details='" + details + '\'' +
                ", company=" + company +
                ", skills=" + skills +
                ", candidature=" + candidature +
                '}';
    }
}
