package adt.linkedin.model;

import jakarta.persistence.*;

@Entity
@Table(name = "job_offer")
public class JobOffer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "min_salary")
    private int minSalary;
    @Column(name = "max_salary")
    private int maxSalary;
    @Column(name = "open")
    private boolean open;
    @Column(name = "required_candidates")
    private int requiredCandidates;
    @Column(name = "work_day_type")
    private String workDayType;
    @Column(name = "title")
    private String title;
    @Column(name = "location")
    private String location;
    @Column(name = "details")
    private String details;
    @Column(name = "company_id")
    private Company company;


}
