package HQLExample;

import org.example.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

public class HQLClass {
    public static void main(String[] args) {

        Configuration cfg = new Configuration();

        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory =cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx= session.beginTransaction();


        Collage clg = new Collage();
        clg.setCity("Beed");
        clg.setName("Munde Collage of Engineering");
        clg.setCollageId(70);



// Save collage first to generate its ID


        Student1 student = new Student1();
        student.setName("Ram");
        student.setCity("Nagar");
        student.setStudentId(30);
        student.setCollage(clg);

        Student1 student1 = new Student1();
        student1.setName("Krushna");
        student1.setCity("Pune");
        student1.setStudentId(40);
        student1.setCollage(clg);

        List<Student1> students = new ArrayList<>();
        students.add(student);
        students.add(student1);

        clg.setStudents(students);  // Set the list of students for the collage

// Save the students

        session.save(clg);
        session.save(student);
        session.save(student1);



// HQL to retrieve and display data
        String query = " from Collage where  name='Munde Collage of Engineering'";
        Query<Collage> q = session.createQuery(query, Collage.class);

        List<Collage> collages = q.list();
        for (Collage c : collages) {
            for (Student1 st : c.getStudents()) {
                System.out.println("Student Name: " + st.getName());
                System.out.println("City: " + st.getCity());

            }
        }


        tx.commit();
        session.close();
        factory.close();

    }
}
