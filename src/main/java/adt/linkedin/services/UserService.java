package adt.linkedin.services;

import adt.linkedin.implementations.UserImplDAO;
import adt.linkedin.model.*;

public class UserService {
    private UserImplDAO controller;

    void addJobExperience(User user, WorkExperience experience, Company company){
    }
    void addSkill(User user, String skill){
        user.getSkills().add(new Skill(skill));
        controller.updateUser(user);
    }
    void printUserInfo(User user){
        System.out.println("Usuario: " + controller.getUser(user.getId()));
        System.out.println("Información Académica: ");
        for (AcademicInfo info : controller.getUserAcademicInfo(user)){
            System.out.println(info);
        }
        System.out.println("Candidaturas: ");
        for (Candidature candidature : controller.getUserCandidatures(user)){
            System.out.println(candidature);
        }
        System.out.println("Habilidades: ");
        for (Skill skill : controller.getUserSkills(user)){
            System.out.println(skill);
        }
        System.out.println("Experiencia Laboral: ");
        for (WorkExperience experience : controller.getUserLaboralExperience(user)){
            System.out.println(experience);
        }
    }
    void addAcademicInfo(User user, AcademicInfo academicInfo){
        user.getAcademics().add(academicInfo);
        controller.updateUser(user);

    }
    void addAcademicInfo(User user, AcademicInfo academicInfo, Institution institution){ //para hacerlo dentro en vez de el main

    }
    void addCandidature(User user, Candidature candidature){
        user.getCandidatures().add(candidature);
        controller.updateUser(user);
    }
    void addCandidature(User user, JobOffer offer, String name, String coverLetterPath){ //igual

    }
    void addCandidature(User user, JobOffer offer){ //esta relacionado

    }
    void addSkill(User user, Skill skill){
        user.getSkills().add(skill);
        controller.updateUser(user);
    }
    void addJobExperience(User user, WorkExperience experience){
        user.getExperiences().add(experience);
    }
    void removeUser(User user){
        controller.removeUser(user);
    }
    void createUser(User user){
        controller.createUser(user);
    }
    void createUser(String name, String mail, int phone, String description){
        controller.createUser(new User(name, mail, phone, description));
    }

}
