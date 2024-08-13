package map;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Answer {
    @Id
    @Column(name="answerId")
    private int ansId;
    private String answer;
    @OneToOne(mappedBy = "answer")
    private Question question;

    public Answer() {
    }

    public Answer(int ansId, String answer, Question question) {
        this.ansId = ansId;
        this.answer = answer;
        this.question = question;
    }

    public int getAnsId() {
        return ansId;
    }

    public void setAnsId(int ansId) {
        this.ansId = ansId;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }
}
