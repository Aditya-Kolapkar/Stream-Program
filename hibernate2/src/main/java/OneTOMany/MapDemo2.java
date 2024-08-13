package OneTOMany;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class MapDemo2 {
    public static void main(String[] args) {

      Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();

        Question1 que= new Question1();
        que.setQuestionId(141);
        que.setQuestion("where do you live");

        Answer ans= new Answer();
        ans.setAnswerId(142);
        ans.setAnswer("i am live in Jamkhed");
        ans.setQuestion1(que);

        Answer ans1= new Answer();
        ans1.setAnswerId(11);
        ans1.setAnswer("i am live in Nannaj");
        ans1.setQuestion1(que);

        Answer ans2= new Answer();
        ans2.setAnswerId(12);
        ans2.setAnswer("i am live in AhilyaNagar");
        ans2.setQuestion1(que);

        List<Answer> ans3=new ArrayList<>();
        ans3.add(ans);
        ans3.add(ans1);
        ans3.add(ans2);
        que.setAnswers(ans3);

        Session session= factory.openSession();
        Transaction tx= session.beginTransaction();

        session.save(que);
        session.save(ans);
        session.save(ans1);
        session.save(ans2);

        tx.commit();
        session.close();
        factory.close();
    }
}
