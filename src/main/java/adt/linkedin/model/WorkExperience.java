package adt.linkedin.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Objects;
@Entity
@Table(name = "laboral_experience")
public class WorkExperience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "current")
    private boolean current;
    @Column(name = "init_date")
    private LocalDate initDate;
    @Column(name = "end_date")
    private LocalDate endDate;
    @Column(name = "job_title")
    private String jobTitle;
    @Column(name = "location")
    private String location;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "company_id", nullable = false)
    private Company company;
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name="user_id", nullable = false)
    private User user;

    public WorkExperience() {
    }

    public WorkExperience(String jobTitle, Company company, String location,  LocalDate initDate) {
        this.current = true;
        this.initDate = initDate;
        this.jobTitle = jobTitle;
        this.location = location;
        this.company = company;
    }
    public WorkExperience(String jobTitle,Company company, String location, LocalDate initDate, LocalDate endDate) {
        this.initDate = initDate;
        this.endDate = endDate;
        this.jobTitle = jobTitle;
        this.location = location;
        this.company = company;
        this.current = false;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isCurrent() {
        return current;
    }

    public void setCurrent(boolean current) {
        this.current = current;
    }

    public LocalDate getInitDate() {
        return initDate;
    }

    public void setInitDate(LocalDate initDate) {
        this.initDate = initDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.initDate);
        hash = 67 * hash + Objects.hashCode(this.jobTitle);
        hash = 67 * hash + Objects.hashCode(this.location);
        hash = 67 * hash + Objects.hashCode(this.company);
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
        final WorkExperience other = (WorkExperience) obj;
        if (!Objects.equals(this.jobTitle, other.jobTitle)) {
            return false;
        }
        if (!Objects.equals(this.location, other.location)) {
            return false;
        }
        if (!Objects.equals(this.initDate, other.initDate)) {
            return false;
        }
        return Objects.equals(this.company.getName(), other.company.getName());
    }
    
    
    

    @Override
    public String toString() {
        return "WorkExperience{" +
                "id=" + id +
                ", current=" + current +
                ", initDate=" + initDate +
                ", endDate=" + endDate +
                ", jobTitle='" + jobTitle + '\'' +
                ", location='" + location + '\'' +
                ", company=" + company +
                ", user=" + user +
                '}';
    }
}
