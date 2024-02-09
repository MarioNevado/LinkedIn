package adt.linkedin.gui;

import adt.linkedin.implementations.UserImplDAO;
import adt.linkedin.model.*;
import adt.linkedin.services.UserService;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        UserImplDAO implDAO = new UserImplDAO();
        UserService service = new UserService();
        //service.createUser(new User("Mario", "1234", "m.nevadomerino@gmail.com", 622001844, ""));
        // service.createUser("Lidia", "abcd", "lidims02@gmail.com", 123456789, "");
        User user = implDAO.getUserByName("Mario");
        Institution institution = new Institution("IES Antares");
        //service.addAcademicInfo(user, new AcademicInfo(true, (float) 9.5, LocalDate.of(2022, 9, 8), "DAM", new Institution("IES Europa")));
        // service.addAcademicInfo(user, new AcademicInfo((float) 9.5, LocalDate.of(2019, 9, 8), LocalDate.of(2021, 6, 21), "Bach", institution), institution);
        //service.addSkill(user, "Trabajo en equipo");
        //service.addCandidature(user, new JobOffer("Desarrollador de Aplicaciones", "Madrid"), "/bin/bash", "hola");
        //service.addCandidature(user, new Candidature("/home/dev", "cogedme de practicas"));
        //?service.addCandidature(user, new JobOffer("Gestor de Bases de Datos", "Madrid"));
        //?service.printUserInfo(user);
        //?service.addJobExperience(user, new WorkExperience(true, LocalDate.of(2023, 9, 14), "Marketing", "Madrid")); COMPANY NULL
        //service.addJobExperience(user, new WorkExperience( LocalDate.of(2021, 11, 28), LocalDate.of(2022, 8, 14), "Operario de Vuelo", "Madrid"), new Company("Swiftair S.A", "una mierda"));
        //service.addSkill(user, new Skill("proactivo"));
        //service.addSkill(user, "eficaz");
        //service.removeUser(user);
        service.







    }
}