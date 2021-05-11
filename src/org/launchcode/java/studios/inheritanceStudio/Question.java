package org.launchcode.java.studios.inheritanceStudio;

public abstract class Question {

    private String question;
    private int pointValue;

    public Question (String aQuestion, int aPointValue) {
        question = aQuestion;
        pointValue = aPointValue;
    }

    public void displayQuestion() {
        System.out.println(question);
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public int getPointValue() {
        return pointValue;
    }

    public void setPointValue(int x) {
        this.pointValue = x;
    }

    public abstract void displayAnswers();


    public abstract int getAnswers();
}
