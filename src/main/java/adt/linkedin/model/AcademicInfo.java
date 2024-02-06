package adt.linkedin.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;

@Entity
@Table(name = "academic_info")
public class AcademicInfo {
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
    @Column(name = "title")
    private String title;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "institution_id", nullable = false)
    private Institution institution;
    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "user_id", nullable = false)
    private User user;


    public AcademicInfo() {
    }

    public AcademicInfo(boolean current, float meanScore, LocalDate initDate, String title, Institution institution) {
        this.current = current;
        this.meanScore = meanScore;
        this.initDate = initDate;
        this.title = title;
        this.institution = institution;
    }
    public AcademicInfo(float meanScore, LocalDate initDate, LocalDate endDate, String title, Institution institution) {
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
}
