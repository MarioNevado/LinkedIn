package adt.linkedin.services;

import adt.linkedin.enumerations.Status;
import adt.linkedin.implementations.UserImplDAO;
import adt.linkedin.model.*;
import jakarta.persistence.NoResultException;
import jakarta.persistence.criteria.*;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.query.Query;

public class UserService {
    
    private final UserImplDAO userController;
    private final Session session;

    public UserService(Session session) {
        this.session = session;
        userController = new UserImplDAO(session);
    }

    public Session getSession() {
        return session;
    }
    
    public List<Skill> getUserSkills(User user) {
        try {
            CriteriaBuilder cb = session.getCriteriaBuilder();
            CriteriaQuery<Skill> cQuery = cb.createQuery(Skill.class);
            Root<User> root = cQuery.from(User.class);
            Join<User, Skill> join = root.join("skills");
            cQuery.where(cb.equal(root, user));
            Query<Skill> query = session.createQuery(cQuery.select(join));
            return query.list();
        } catch (Exception e) {
            e.printStackTrace();
            if (session.isOpen()) {
                session.close();
            }
        }
        return null;
    }
    
    public List<Candidature> getUserCandidatures(User user) {
        try {
            CriteriaBuilder cb = session.getCriteriaBuilder();
            CriteriaQuery<Candidature> cQuery = cb.createQuery(Candidature.class);
            Root<User> root = cQuery.from(User.class);
            Join<User, Candidature> join = root.join("candidatures");
            cQuery.where(cb.equal(root, user));
            Query<Candidature> query = session.createQuery(cQuery.select(join));
            return query.list();
        }catch(NoResultException nre){
            return null;
        }catch (Exception e) {
            e.printStackTrace();
            if (session.isOpen()) {
                session.close();
            }
        }
        return null;
    }
    
    public List<WorkExperience> getUserLaboralExperience(User user) {
        try{
            CriteriaBuilder cb = session.getCriteriaBuilder();
            CriteriaQuery<WorkExperience> cQuery = cb.createQuery(WorkExperience.class);
            Root<User> root = cQuery.from(User.class);
            Join <User, WorkExperience> join = root.join("experiences");
            cQuery.where(cb.equal(root, user));
            Query<WorkExperience> query = session.createQuery(cQuery.select(join));
            return query.list();
        }catch(NoResultException nre){
            return null;
        }catch (Exception e){
            e.printStackTrace();
            if (session.isOpen()) {
                session.close();
            }
        }
        return null;
    }
    
    public List<AcademicInfo> getUserAcademicInfo(User user) {
        try {
            CriteriaBuilder cb = session.getCriteriaBuilder();
            CriteriaQuery<AcademicInfo> cQuery = cb.createQuery(AcademicInfo.class);
            Root<User> root = cQuery.from(User.class);
            Join<User, AcademicInfo> join = root.join("academics");
            cQuery.where(cb.equal(root, user));
            Query<AcademicInfo> query = session.createQuery(cQuery.select(join)); //?
            return query.list();
        }catch(NoResultException nre){
            return null;
        }catch (Exception e) {
            e.printStackTrace();
            if (session.isOpen()) {
                session.close();
            }
        }
        return null;
    }
    
    public User getUserByPhone(int phone, String password) {
        try{
            CriteriaBuilder cb = session.getCriteriaBuilder();
            CriteriaQuery<User> cQuery = cb.createQuery(User.class);
            Root <User> root = cQuery.from(User.class);
            cQuery.where(cb.and(cb.equal(root.get("phone"), phone)), cb.equal(root.get("password"), password));
            Query <User> query = session.createQuery(cQuery);
            return query.getSingleResult();
        }catch(NoResultException nre){
            return null;
        }catch(Exception e){
            if (session.isOpen()) {
                session.close();
            }
            return null;
            
        }
    }
    
    public User getUserByEmail(String email, String password) {
        try{
            CriteriaBuilder cb = session.getCriteriaBuilder();
            CriteriaQuery<User> cQuery = cb.createQuery(User.class);
            Root <User> root = cQuery.from(User.class);
            cQuery.where(cb.and(cb.equal(root.get("email"), email)), cb.equal(root.get("password"), password));
            Query <User> query = session.createQuery(cQuery);
            return query.getSingleResult();
        }catch(NoResultException nre){
            return null;
        }catch(Exception e){
            if (session.isOpen()) {
                session.close();
            }
            return null;
        }
    }
    
    public User getUserByName(String name) {
        try{
            CriteriaBuilder cb = session.getCriteriaBuilder();
            CriteriaQuery<User> cQuery = cb.createQuery(User.class);
            Root<User> root = cQuery.from(User.class);
            cQuery.where(cb.equal(root.get("name"), name));
            Query<User> query = session.createQuery(cQuery);
            return query.getSingleResult();
        }catch(NoResultException nre){
            return null;
        }catch(Exception e){
            e.printStackTrace();
            if (session.isOpen()) {
                session.close();
            }
            return null;
        }
    }
    
    public List<User> getUsersByName(String name) {
        try {
            CriteriaBuilder cb = session.getCriteriaBuilder();
            CriteriaQuery<User> cQuery = cb.createQuery(User.class);
            Root<User> root = cQuery.from(User.class);
            cQuery.where(cb.like(root.get("name"), "%" +  name + "%"));
            Query<User> query = session.createQuery(cQuery);
            return query.list();
        } catch(NoResultException nre){
            return null;
        }catch (Exception e) {
            if (session.isOpen()) {
                session.close();
            }
            e.printStackTrace();
        }
        return null;
    }
    
    public User getUserById(long id) {
        try {
            CriteriaBuilder cb = session.getCriteriaBuilder();
            CriteriaQuery<User> cQuery = cb.createQuery(User.class);
            Root<User> root = cQuery.from(User.class);
            cQuery.select(root).where(cb.equal(root.get("id"), id));
            Query<User> query = session.createQuery(cQuery);
            return query.getSingleResult();
        } catch(NoResultException nre){
            return null;
        }catch (Exception e) {
            if (session.isOpen()) {
                session.close();
            }
            e.printStackTrace();
        }
        return null;
    }

    public void addJobExperience(User user, WorkExperience experience, Company company){
        user.getExperiences().add(experience);
        company.getExperiences().add(experience);
        experience.setCompany(company);
        experience.setUser(user);
        userController.updateUser(user);
    }
    
    public void addSkill(User user, String skill){
        user.getSkills().add(new Skill(skill));
        userController.updateUser(user);
    }
    
    /**
     * Muestra por pantalla la información del usuario
     * @param user usuario del cual queremos saber su información
     */
    public void printUserInfo(User user){
        System.out.println("Usuario: " + getUserById(user.getId()));
        System.out.println("Información Académica: ");
        for (AcademicInfo info : getUserAcademicInfo(user)){
            System.out.println(info);
        }
        System.out.println("Candidaturas: ");
        for (Candidature candidature : getUserCandidatures(user)){
            System.out.println(candidature);
        }
        System.out.println("Habilidades: ");
        for (Skill skill : getUserSkills(user)){
            System.out.println(skill);
        }
        System.out.println("Experiencia Laboral: ");
        for (WorkExperience experience : getUserLaboralExperience(user)){
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
        candidature.setUser(user);
        userController.updateUser(user);
    }
    
    public void addCandidature(User user, JobOffer offer, String cvPath, String coverLetterPath){ 
        Candidature candidature = new Candidature(cvPath, coverLetterPath);
        candidature.setStatus(Status.PENDING);
        candidature.setUser(user);
        candidature.setOffer(offer);
        user.getCandidatures().add(candidature);
        offer.getCandidatures().add(candidature);
        userController.updateUser(user);
    }
    
    public void addCandidature(User user, JobOffer offer){ 
        Candidature c = new Candidature();
        user.getCandidatures().add(c);
        c.setUser(user);
        offer.getCandidatures().add(c);
        c.setOffer(offer);
        c.setStatus(Status.PENDING);
        userController.updateUser(user);
    }
    
    public void addSkill(User user, Skill skill){
        user.getSkills().add(skill);
        skill.getUsers().add(user);
        userController.updateUser(user);
    }
    
    public void addJobExperience(User user, WorkExperience experience){
        user.getExperiences().add(experience);
        experience.setUser(user);
        userController.updateUser(user);
    }
    
    /**
     * Busca si un usuario ha aplicado a una oferta de trabajo recorriendo la lista de candidaturas del usuario y de la oferta
     * @param user usuario que queremos saber si ha aplicado a una oferta
     * @param offer oferta de la que queremos saber si entre sus candidaturas se encuentra la del usuario
     * @return true si la oferta contiene su candidatura, false si no
     */
    public boolean hasApplied(User user, JobOffer offer){
        for (Candidature candidature : offer.getCandidatures()) {
            for (Candidature aux : user.getCandidatures()) {
                if (aux.equals(candidature)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public void removeUser(User user){
        userController.removeUser(user);
    }
    
    public void createUser(User user){
        userController.createUser(user);
    }
    
    public void updateUser(User user){
        userController.updateUser(user);
    }
    
    public void createUser(String name, String password, String mail, int phone, String description){
        userController.createUser(new User(name, password, mail, phone, description));
    }

}
