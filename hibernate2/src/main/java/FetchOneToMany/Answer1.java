package FetchOneToMany;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;


@Entity
public class Answer1 {

    @Id
    private int ansId;

    private String Answer;

    @ManyToOne
    private Question1 question1;

    public Answer1(int i, String myCurrentLocationIsPune) {
    }


    public int getAnsId() {
        return ansId;
    }

    public void setAnsId(int ansId) {
        this.ansId = ansId;
    }

    public String getAnswer() {
        return Answer;
    }

    public void setAnswer(String answer) {
        Answer = answer;
    }

    public Question1 getQuestion1() {
        return question1;
    }

    public void setQuestion1(Question1 question1) {
        this.question1 = question1;
    }

    public Answer1() {
    }

    public Answer1(int ansId, String answer, Question1 question1) {
        this.ansId = ansId;
        Answer = answer;
        this.question1 = question1;
    }

}
