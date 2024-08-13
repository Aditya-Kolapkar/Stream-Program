package org.example.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class App {
        public static void main(String[] args) {
                // Prep Work
                SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

                // Save example - with transaction
                Session session = sessionFactory.openSession();
                Transaction tx = session.beginTransaction();
                Employee emp = getTestEmployee();
                long id = (Long) session.save(emp);
                session.flush(); // address will get saved because of this
                tx.commit(); // Commit the transaction
                session.close();
                System.out.println("1. Employee save called with transaction, id=" + id);
                System.out.println("*");

                // Save example - with transaction
                session = sessionFactory.openSession();
                Transaction tx1 = session.beginTransaction();
                Employee emp1 = getTestEmployee();
                long id1 = (Long) session.save(emp1);
                System.out.println("2. Employee save called with transaction, id=" + id1);
                System.out.println("3. Before committing save transaction");
                tx1.commit();
                System.out.println("4. After committing save transaction");
                session.close();
                System.out.println("*");

                // Save example - existing row in table
                session = sessionFactory.openSession();
                Transaction tx6 = session.beginTransaction();
                Employee emp6 = (Employee) session.get(Employee.class, id1); // Changed from new Long(20) to id1 for demonstration

                if (emp6 != null) {
                        // Update some data
                        System.out.println("Employee Details=" + emp6);
                        emp6.setName("New Name");
                        emp6.getAddress().setCity("New City");

                        session.update(emp6);
                        emp6.setName("New Name1"); // will get updated in database
                        System.out.println("5. Employee save called with transaction, id=" + emp6.getId());
                        System.out.println("6. Before committing save transaction");
                        tx6.commit();
                        System.out.println("7. After committing save transaction");
                } else {
                        System.out.println("Employee not found with id=" + id1);
                }
                session.close();
                System.out.println("*");

                // Close resources
                sessionFactory.close();
        }

        public static Employee getTestEmployee() {
                Employee emp = new Employee();
                Address add = new Address();
                emp.setName(" Emp");
                emp.setSalary(2000);
                add.setAddressLine1(" address1");
                add.setCity(" City");
                add.setZipcode("121");
                emp.setAddress(add);
                add.setEmployee(emp);
                return emp;
        }
}