package FetchOneToMany;

import map.Question;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class Fetchclass {
    public static void main(String[] args) {

        Configuration cfg =new Configuration();
        cfg.configure("hibernate.cfg.xml");

        SessionFactory factory = cfg.buildSessionFactory();

        Question1 que= new Question1();
       que.setId(44);
        que.setQuestion("what is your hobby ");

       Answer1 ans =new Answer1();
       ans.setAnsId(50);
       ans.setAnswer("My hobby is playing Cricket");

       que.setQuestion(String.valueOf(ans));

       Answer1 ans1 = new Answer1();
        ans1.setAnsId(51);
      ans1.setAnswer("My hobby is playing PUBG");

        List<Answer1>list =  new ArrayList<>();
        list.add(ans);
        list.add(ans1);
        que.setAnswers(list);



        Session session = factory.openSession();
        Transaction tx= session.beginTransaction();

       session.save(que);

       session.save(ans);

       session.save(ans1);


        Question1 question=(Question1)session.get(Question1.class,44);
        System.out.println(question.getId());
        System.out.println(question.getQuestion());

        System.out.println(question.getAnswers().size());

        tx.commit();
        session.close();
        factory.close();
    }
}
