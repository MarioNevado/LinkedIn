package adt.linkedin.gui;

import adt.linkedin.utils.HibernateUtil;

public class Main {
    public static void main(String[] args) {
        HibernateUtil.getSessionFactory().openSession();
    }
}