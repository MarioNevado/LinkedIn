package adt.linkedin.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "skills")
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "name")
    private String name;
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "users_skills", joinColumns = @JoinColumn(name = "skill_id"), inverseJoinColumns = @JoinColumn(name = "user_id")) //primero yo mismo y luego a la que apunta
    private List<User> users;
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "offers_skills", joinColumns = @JoinColumn(name = "skill_id"), inverseJoinColumns = @JoinColumn(name = "job_offer_id")) //primero yo mismo y luego a la que apunta
    private List<JobOffer> offers;

    public Skill(String name) {
        this.name = name;
    }
}
