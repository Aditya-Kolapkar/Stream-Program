package map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class mapDemo {
    public static void main(String[] args) {


        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();

        //creating question object;
        Question q=new Question();
        q.setQuestionId(1511);
        q.setQuestion("what is your name");


        Answer answer= new Answer();
        answer.setAnsId(303);
        answer.setAnswer("my name is aditya");
        answer.setQuestion(q);
        q.setAnswer(answer);
        //creating 2 question
        Question q1=new Question();

        q1.setQuestionId(111);
        q1.setQuestion("what is your SureName");


        Answer answer2= new Answer();
        answer2.setAnsId(33);
        answer2.setAnswer("My name is Kolapkar");
        answer2.setQuestion(q1);

        q1.setAnswer(answer2);


        Session session= factory.openSession();
        Transaction tx= session.beginTransaction();

        session.save(answer);
        session.save(answer2);
        session.save(q);
        session.save(q1);

        tx.commit();

        //fetching
        Question Que=(Question)session.get(Question.class,1511);
        System.out.println(Que.getQuestion());
        System.out.println(Que.getAnswer().getAnswer());

        Question Que1=(Question)session.get(Question.class,111);
        System.out.println(Que1.getQuestion());
        System.out.println(Que1.getAnswer().getAnswer());





        factory.close();
    }
}
