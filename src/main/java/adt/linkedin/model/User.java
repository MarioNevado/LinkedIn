package adt.linkedin.model;


import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name", nullable = false)
    private String name;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "users_skills", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "skill_id"))
    private List<Skill> skills;

    @ManyToMany(cascade = {CascadeType.MERGE, CascadeType.REMOVE})
    @JoinTable(name = "users_candidatures", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "candidature_id"))
    private List<Candidature> candidatures;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private List<WorkExperience> experiences = new ArrayList<>();

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, mappedBy = "user")
    private List<AcademicInfo> academics;
    public User() {
    }

    public User(String name) {
        this.name = name;
    }
}