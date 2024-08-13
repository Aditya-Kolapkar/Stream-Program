package org.example.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {
    public static void main(String[] args) {


        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");

        SessionFactory factory= cfg.buildSessionFactory();
        Session session= factory.openSession();


        Student student= (Student) session.get(Student.class,110);
       System.out.println(student);

        Name name=(Name)session.get(Name.class,0);
        System.out.println(name.getX() + name.getX());

        session.close();
        factory.close();

    }
}