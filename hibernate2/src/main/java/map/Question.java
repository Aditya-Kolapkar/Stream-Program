package map;

import jakarta.persistence.*;

@Entity
public class Question {

    @Id
    @Column(name="questionId")
    private int questionId;
    private String question;

    @OneToOne
    @JoinColumn(name="A_id")
    private Answer answer;

    public Question(String question, int questionId, Answer answer) {
        this.question = question;
        this.questionId = questionId;
        this.answer = answer;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Answer getAnswer() {
        return answer;
    }

    public void setAnswer(Answer answer) {
        this.answer = answer;
    }

    public Question() {
    }
}
