package joy.kamrujjaman.quiz.model;

public class Quiestion {
    private String questionId, question, questionA, questionB, questionC, questionD, correctAns;

    public Quiestion(String questionId, String question, String questionA, String questionB, String questionC, String questionD, String correctAns) {
        this.questionId = questionId;
        this.question = question;
        this.questionA = questionA;
        this.questionB = questionB;
        this.questionC = questionC;
        this.questionD = questionD;
        this.correctAns = correctAns;
    }

    public String getQuestionId() {
        return questionId;
    }

    public String getQuestion() {
        return question;
    }

    public String getQuestionA() {
        return questionA;
    }

    public String getQuestionB() {
        return questionB;
    }

    public String getQuestionC() {
        return questionC;
    }

    public String getQuestionD() {
        return questionD;
    }

    public String getCorrectAns() {
        return correctAns;
    }
}
