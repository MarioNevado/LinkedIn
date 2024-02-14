package adt.linkedin.implementations;

import adt.linkedin.dao.UserDAO;
import adt.linkedin.model.*;
import adt.linkedin.tools.HibernateUtil;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Join;
import jakarta.persistence.criteria.Root;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.hibernate.resource.transaction.spi.TransactionStatus;

import java.util.List;

public class UserImplDAO implements UserDAO {
    /*
    SELECT * from academic_info ai
join users u
on ai.user_id = u.id ;
     */
    @Override
    public List<AcademicInfo> getUserAcademicInfo(User user) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            CriteriaBuilder cb = session.getCriteriaBuilder();
            CriteriaQuery<AcademicInfo> cQuery = cb.createQuery(AcademicInfo.class);
            Root<User> root = cQuery.from(User.class);
            Join<User, AcademicInfo> join = root.join("academics");
            cQuery.where(cb.equal(root, user));
            Query<AcademicInfo> query = session.createQuery(cQuery.select(join)); //?
            return query.list();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    @Override
    public void removeUser(User user) {
        Transaction tx = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            if (user != null) {
                tx = session.beginTransaction();
                session.remove(user);
                tx.commit();
            }
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        }
    }
    @Override
    public User getUser(long id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            CriteriaBuilder cb = session.getCriteriaBuilder();
            CriteriaQuery<User> cQuery = cb.createQuery(User.class);
            Root<User> root = cQuery.from(User.class);
            cQuery.select(root).where(cb.equal(root.get("id"), id));
            Query<User> query = session.createQuery(cQuery);
            return query.getSingleResult();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    @Override
    public List<Skill> getUserSkills(User user) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            CriteriaBuilder cb = session.getCriteriaBuilder();
            CriteriaQuery<Skill> cQuery = cb.createQuery(Skill.class);
            Root<User> root = cQuery.from(User.class);
            Join<User, Skill> join = root.join("skills"); //aunque no se use se indica
            cQuery.where(cb.equal(root, user));
            Query<Skill> query = session.createQuery(cQuery.select(join));
            return query.list();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Candidature> getUserCandidatures(User user) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            CriteriaBuilder cb = session.getCriteriaBuilder();
            CriteriaQuery<Candidature> cQuery = cb.createQuery(Candidature.class);
            Root<User> root = cQuery.from(User.class);
            Join<User, Candidature> join = root.join("candidatures");
            cQuery.where(cb.equal(root, user));
            Query<Candidature> query = session.createQuery(cQuery.select(join));
            return query.list();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<User> getUsersByName(String name) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            CriteriaBuilder cb = session.getCriteriaBuilder();
            CriteriaQuery<User> cQuery = cb.createQuery(User.class);
            Root<User> root = cQuery.from(User.class);
            cQuery.select(root.get("academics")).where(cb.like(root.get("name"), "%" +  name + "%"));
            Query<User> query = session.createQuery(cQuery);
            return query.list();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    @Override
    public void updateUser(User user) {
        System.out.println("USUARIO" +user);
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            if (user != null) {
                transaction = session.beginTransaction();
                session.merge(user);
                transaction.commit();
            }else System.out.println("Usuario Nulo");
        } catch (HibernateException h) {
            h.printStackTrace();
            if (transaction != null) transaction.rollback();
            throw new HibernateException("Error actualizando");
        }
    }
    @Override
    public void createUser(User user) {
        Transaction tx = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            if (user != null) {
                tx = session.beginTransaction();
                session.persist(user);
                tx.commit();
            } else throw new HibernateException("El producto está vacío");
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        }
    }
    @Override
    public List<WorkExperience> getUserLaboralExperience(User user) {
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            CriteriaBuilder cb = session.getCriteriaBuilder();
            CriteriaQuery<WorkExperience> cQuery = cb.createQuery(WorkExperience.class);
            Root<User> root = cQuery.from(User.class);
            Join <User, WorkExperience> join = root.join("experiences");
            cQuery.where(cb.equal(root, user));
            Query<WorkExperience> query = session.createQuery(cQuery.select(join));
            return query.list();
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public User getUserByName(String name) {
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            CriteriaBuilder cb = session.getCriteriaBuilder();
            CriteriaQuery<User> cQuery = cb.createQuery(User.class);
            Root<User> root = cQuery.from(User.class);
            cQuery.where(cb.equal(root.get("name"), name));
            Query<User> query = session.createQuery(cQuery);
            return query.getSingleResult();
        }catch(Exception e){
            return null;
        }
    }

    @Override
    public User getUserByPhone(int phone, String password) {
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            CriteriaBuilder cb = session.getCriteriaBuilder();
            CriteriaQuery<User> cQuery = cb.createQuery(User.class);
            Root <User> root = cQuery.from(User.class);
            cQuery.where(cb.and(cb.equal(root.get("phone"), phone)), cb.equal(root.get("password"), password));
            Query <User> query = session.createQuery(cQuery);
            return query.getSingleResult();
        }catch(Exception e){
            return null;
        }
    }

    @Override
    public User getUserByEmail(String email, String password) {
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            CriteriaBuilder cb = session.getCriteriaBuilder();
            CriteriaQuery<User> cQuery = cb.createQuery(User.class);
            Root <User> root = cQuery.from(User.class);
            cQuery.where(cb.and(cb.equal(root.get("email"), email)), cb.equal(root.get("password"), password));
            Query <User> query = session.createQuery(cQuery);
            return query.getSingleResult();
        }catch(Exception e){
            return null;
        }
    }
}
