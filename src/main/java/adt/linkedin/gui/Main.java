package adt.linkedin.gui;

import adt.linkedin.implementations.UserImplDAO;
import adt.linkedin.model.*;
import adt.linkedin.services.CompanyService;
import adt.linkedin.services.UserService;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        UserImplDAO userDAO = new UserImplDAO();
        UserService userService = new UserService();
        CompanyService companyService = new CompanyService();
        //userService.createUser(new User("Mario", "1234", "m.nevadomerino@gmail.com", 622001844, ""));
        // userService.createUser("Lidia", "abcd", "lidims02@gmail.com", 123456789, "");
        User user = userDAO.getUserByName("Mario");
        Institution institution = new Institution("IES Antares");
        //userService.addAcademicInfo(user, new AcademicInfo(true, (float) 9.5, LocalDate.of(2022, 9, 8), "DAM", new Institution("IES Europa")));
        // userService.addAcademicInfo(user, new AcademicInfo((float) 9.5, LocalDate.of(2019, 9, 8), LocalDate.of(2021, 6, 21), "Bach", institution), institution);
        //userService.addSkill(user, "Trabajo en equipo");
        //userService.addCandidature(user, new JobOffer("Desarrollador de Aplicaciones", "Madrid"), "/bin/bash", "hola");
        //userService.addCandidature(user, new Candidature("/home/dev", "cogedme de practicas"));
        //userService.addCandidature(user, new JobOffer("Gestor de Bases de Datos", "Madrid"));
        //?userService.printUserInfo(user);
        //?userService.addJobExperience(user, new WorkExperience(true, LocalDate.of(2023, 9, 14), "Marketing", "Madrid")); COMPANY NULL
        //userService.addJobExperience(user, new WorkExperience( LocalDate.of(2021, 11, 28), LocalDate.of(2022, 8, 14), "Operario de Vuelo", "Madrid"), new Company("Swiftair S.A", "una mierda"));
        //userService.addSkill(user, new Skill("proactivo"));
        //userService.addSkill(user, "eficaz");
        //userService.removeUser(user);
        //companyService.createCompany("hidrovinisa");
        //companyService.createCompany(new Company("amazon", "esta en su amazonas"));
        //companyService.createCompany("nude project", "marca pa pijos que quieren ir de aesthetic");
        companyService.printCompanyInfo(companyService.createCompany("dhl"));








    }
}