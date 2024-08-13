package FetchOneToMany;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity(name = "question_Id")
public class Question1 {

    @Id
    @Column(name = "questionId")
    private int Id;

    private String question;

    @OneToMany( fetch = FetchType.LAZY)
    private List<Answer1>answers= new ArrayList<>();

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<Answer1> getAnswers() {
        return answers;
    }

    public List<Answer1> setAnswers(List<Answer1>answers) {
        return this.answers=answers;

    }

    public Question1(int id, String question, List<Answer1> answers) {
        Id = id;
        this.question = question;
        this.answers = answers;
    }

    public Question1() {
    }
}
