package adt.linkedin.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "academic_info", uniqueConstraints = @UniqueConstraint(columnNames = {"title", "init_date", "end_date"}))
public class AcademicInfo{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "current")
    private boolean current;
    @Column(name = "mean_score")
    private float meanScore;
    @Column(name = "init_date")
    private LocalDate initDate;
    @Column(name = "end_date")
    private LocalDate endDate;
    @Column(name = "title", nullable = false)
    private String title;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "institution_id", nullable = false)
    private Institution institution;
    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "user_id", nullable = false)
    private User user;


    public AcademicInfo() {
    }

    public AcademicInfo(String title, Institution institution,float meanScore, LocalDate initDate ) {
        this.current = true;
        this.meanScore = meanScore;
        this.initDate = initDate;
        this.title = title;
        this.institution = institution;
    }
    public AcademicInfo(String title, Institution institution,float meanScore, LocalDate initDate, LocalDate endDate ) {
        this.current = false;
        this.meanScore = meanScore;
        this.initDate = initDate;
        this.endDate = endDate;
        this.title = title;
        this.institution = institution;
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

    public float getMeanScore() {
        return meanScore;
    }

    public void setMeanScore(float meanScore) {
        this.meanScore = meanScore;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Institution getInstitution() {
        return institution;
    }

    public void setInstitution(Institution institution) {
        this.institution = institution;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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
        final AcademicInfo other = (AcademicInfo) obj;
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Objects.equals(this.initDate, other.initDate)) {
            return false;
        }
        if (!Objects.equals(this.endDate, other.endDate)) {
            return false;
        }
        return Objects.equals(this.institution.getName(), other.institution.getName());
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.initDate);
        hash = 59 * hash + Objects.hashCode(this.endDate);
        hash = 59 * hash + Objects.hashCode(this.title);
        hash = 59 * hash + Objects.hashCode(this.institution.getName());
        return hash;
    }
    
    

    @Override
    public String toString() {
        if (!current) {
            return title + "  " + institution.getName() + "  " + meanScore + "  " + initDate + "  " + endDate;
        }else{
            return title + "  " + institution.getName() + "  " + meanScore + "  " + initDate + "  Actual";
        }
    }
    
    
}
