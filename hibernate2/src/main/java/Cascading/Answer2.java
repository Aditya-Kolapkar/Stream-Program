package Cascading;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Answer2 {
    @Id
    @Column(name="answer_Id")
    private  int answerId;

    private String answer;

    private int year;

    @ManyToOne
    private Question question;

    public Answer2() {
    }

    public Answer2(int answerId, String answer, int year, Question question) {
        this.answerId = answerId;
        this.answer = answer;
        this.year = year;
        this.question = question;
    }

    public Answer2(int i, String javaIsObjwectOrientedLanguage) {
    }

    public int getAnswerId() {
        return answerId;
    }

    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }
}
