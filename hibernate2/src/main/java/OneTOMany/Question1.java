package OneTOMany;

import jakarta.persistence.*;

import java.util.List;


@Entity
public class Question1 {

@Id
@Column(name = "question1")
    private int questionId;

    private String question;
@OneToMany(mappedBy = "question1")
private List<Answer> answers;


    public List<Answer> getAnswers() {
        return answers;
    }

    public List<Answer> setAnswers(List<Answer> Answer) {
        return answers;
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


    public Question1(int questionId, String question, List<Answer> answers) {
        this.questionId = questionId;
        this.question = question;
        this.answers = answers;
    }

    public Question1() {
    }



}
