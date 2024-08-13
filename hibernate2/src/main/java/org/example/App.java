package org.example;

import org.example.entity.Name;
import org.example.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;


public class App
{

    public static <Email> void main(String[] args) throws IOException {

        System.out.println("hibernate2");

        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();


        // Creating Student :

//        Student st = new Student();
//        st.setId(110);
//        st.setName("adesh");
//        st.setEmail("adeshkolapkar1@gmail.com");
//        System.out.println(st);

        //creating object of Name
        Name name = new Name();
        name.setStreet("1204");
        name.setEmail("451044");
        name.setOpen(true);
        name.setAddedDate(new Date());
        name.setX(124.0);
        System.out.println(name);
        //read image;
        FileInputStream fe= new FileInputStream("src/main/java/IMG_20230826_144100.jpg");
        byte[] data=new byte[fe.available()];
        fe.read(data);
        name.setImage(data);


        Session session = factory.openSession();
        //
        Transaction tx = session.beginTransaction();


//        session.save(st);
        session.save(name);

        tx.commit();
        session.close();


        System.out.println("code is Done");


    }
}
