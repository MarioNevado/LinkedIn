package adt.linkedin.services;

import adt.linkedin.implementations.UserImplDAO;
import adt.linkedin.model.*;

public class UserService {
    private UserImplDAO userController = new UserImplDAO();

    public void addJobExperience(User user, WorkExperience experience, Company company){
        user.getExperiences().add(experience);
        company.getExperiences().add(experience);
        userController.updateUser(user);
    }
    public void addSkill(User user, String skill){
        user.getSkills().add(new Skill(skill));
        userController.updateUser(user);
    }
    public void printUserInfo(User user){
        System.out.println("Usuario: " + userController.getUser(user.getId()));
        System.out.println("Información Académica: ");
        for (AcademicInfo info : userController.getUserAcademicInfo(user)){
            System.out.println(info);
        }
        System.out.println("Candidaturas: ");
        for (Candidature candidature : userController.getUserCandidatures(user)){
            System.out.println(candidature);
        }
        System.out.println("Habilidades: ");
        for (Skill skill : userController.getUserSkills(user)){
            System.out.println(skill);
        }
        System.out.println("Experiencia Laboral: ");
        for (WorkExperience experience : userController.getUserLaboralExperience(user)){
            System.out.println(experience);
        }
    }
    public void addAcademicInfo(User user, AcademicInfo academicInfo){
        academicInfo.setUser(user);
        user.getAcademics().add(academicInfo);
        userController.updateUser(user);

    }
    public void addAcademicInfo(User user, AcademicInfo academicInfo, Institution institution){ //para hacerlo dentro en vez de el main
        academicInfo.setUser(user);
        academicInfo.setInstitution(institution);
        user.getAcademics().add(academicInfo);
        institution.getAcademicInfos().add(academicInfo);
        userController.updateUser(user);
    }
    public void addCandidature(User user, Candidature candidature){
        user.getCandidatures().add(candidature);
        userController.updateUser(user);
    }
    public void addCandidature(User user, JobOffer offer, String cvPath, String coverLetterPath){ //igual
        user.getCandidatures().add(new Candidature(cvPath, coverLetterPath));
        offer.setCandidature(new Candidature(cvPath, coverLetterPath));
        userController.updateUser(user);
    }
    public void addCandidature(User user, JobOffer offer){ //?
    }
    public void addSkill(User user, Skill skill){
        user.getSkills().add(skill);
        userController.updateUser(user);
    }
    public void addJobExperience(User user, WorkExperience experience){
        user.getExperiences().add(experience);
        userController.updateUser(user);
    }
    public void removeUser(User user){
        userController.removeUser(user);
    }
    public void createUser(User user){
        userController.createUser(user);
    }
    public void createUser(String name, String password, String mail, int phone, String description){
        userController.createUser(new User(name, password, mail, phone, description));
    }

}
