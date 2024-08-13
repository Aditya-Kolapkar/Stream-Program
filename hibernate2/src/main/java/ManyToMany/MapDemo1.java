package ManyToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class MapDemo1 {
    public static void main(String[] args) {

        Configuration cfg= new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory= cfg.buildSessionFactory();

        Employee emp=new Employee();
        emp.setEmpId(100);
        emp.setName("Hari");

        Employee emp1=new Employee();
        emp1.setEmpId(101);
        emp1.setName("Shyam");

        Project pro= new Project();
        pro.setProId(1010);
        pro.setProName("Hotel Management System");

        Project pro1= new Project();
        pro1.setProId(1011);
        pro1.setProName("Bus Pass Management System");

        List<Employee> list = new ArrayList<Employee>();
        List<Project> list1 = new ArrayList<Project>();

        list.add(emp);
        list.add(emp1);

        list1.add(pro);
        list1.add(pro1);

        //set the employee and project;
        emp.setProject(list1);
        pro.setEmp(list);

        Session session= factory.openSession();
        Transaction tx = session.beginTransaction();

        session.save(emp);
        session.save(emp1);
        session.save(pro);
        session.save(pro1);

        tx.commit();
        session.close();
        factory.close();
    }
}
