package adt.linkedin.model;


import jakarta.persistence.*;
import org.checkerframework.common.aliasing.qual.Unique;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users", uniqueConstraints = {@UniqueConstraint(columnNames = "name")})
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "mail")
    private String mail;
    @Column(name = "phone")
    private int phone;
    @Column(name = "description")
    private String description;
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "users_skills", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "skill_id"))
    private List<Skill> skills;

    @OneToMany(cascade = {CascadeType.MERGE, CascadeType.REMOVE}, mappedBy = "user")
    private List<Candidature> candidatures;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private List<WorkExperience> experiences = new ArrayList<>();

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, mappedBy = "user")
    private List<AcademicInfo> academics;
    public User() {
    }

    public User(String name, String mail, int phone, String description) {
        this.name = name;
        this.mail = mail;
        this.phone = phone;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public void setCandidatures(List<Candidature> candidatures) {
        this.candidatures = candidatures;
    }

    public List<WorkExperience> getExperiences() {
        return experiences;
    }

    public void setExperiences(List<WorkExperience> experiences) {
        this.experiences = experiences;
    }

    public List<AcademicInfo> getAcademics() {
        return academics;
    }

    public void setAcademics(List<AcademicInfo> academics) {
        this.academics = academics;
    }
}