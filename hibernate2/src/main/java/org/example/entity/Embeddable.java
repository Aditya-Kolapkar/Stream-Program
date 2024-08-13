package org.example.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Embeddable {

    public static void main(String[] args) {

        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();

        Student student1= new Student();
        student1.setStudent_id(111);
        student1.setEmail("adityakolapkar1@123");

       Certificate cer= new Certificate();
        cer.setCourse("Abc");
        cer.setDuration("6 months");
        student1.setCerti(cer);

        Session session= factory.openSession();
        Transaction tx= session.beginTransaction();
        session.save(student1);

        Student student2= new Student();
        student2.setStudent_id(121);
        student2.setEmail("rahulkolapkar1@123");

        Certificate cer1= new Certificate();
        cer1.setCourse("xyz");
        cer1.setDuration("2 months");
        student2.setCerti(cer1);
        session.save(student2);

        tx.commit();
        session.close();
        factory.close();
    }
}
