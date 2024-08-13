package Cascading;

import FetchOneToMany.Question1;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class CascadeExample {
    public static void main(String[] args) {


        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        Question que1 = new Question();

        que1.setQuestionId(54);
        que1.setQuestionnn("abc");


        Answer2 ans = new Answer2();
        ans.setAnswerId(41);
        ans.setAnswer("suraj");
        ans.setQuestion(que1);

        Answer2 ans2 = new Answer2();
        ans2.setAnswerId(42);
        ans2.setAnswer("harsh");
        ans2.setQuestion(que1);

        Answer2 ans3= new Answer2();
        ans3.setAnswerId(43);
        ans3.setAnswer("ram");
        ans3.setQuestion(que1);

        List<Answer2> list1 =new ArrayList<>();
        list1.add(ans);
        list1.add(ans2);
        list1.add(ans3);
        que1.setAnswer2(list1);

        session.save(que1);

        tx.commit();

        session.close();
        factory.close();



    }
}
