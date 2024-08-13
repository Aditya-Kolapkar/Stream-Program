package Cascading;

import OneTOMany.Answer;
import jakarta.persistence.*;

import java.util.List;
@Entity
@Table(name="questionnnn")
public class Question {
@Id
    private int questionId;

    private String questionnn;

    private int year;

    @OneToMany(mappedBy = "question",cascade = CascadeType.ALL)
    private List<Answer2> answer2;

    public Question() {
    }

    public Question(int questionId, String questionnn, int year, List<Answer2> answer2) {
        this.questionId = questionId;
        this.questionnn = questionnn;
        this.year = year;
        this.answer2 = answer2;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getQuestionnn() {
        return questionnn;
    }

    public void setQuestionnn(String questionnn) {
        this.questionnn = questionnn;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<Answer2> getAnswer2() {
        return answer2;
    }

    public void setAnswer2(List<Answer2> answer2) {
        this.answer2 = answer2;
    }

}

