package org.launchcode.java.studios.inheritanceStudio;

import java.util.Scanner;

public class TrueFalse extends Question {

    private boolean correctAnswer;

    public TrueFalse(String aQuestion, int aPointValue, boolean aCorrectAnswer) {
        super(aQuestion, aPointValue);
        setPointValue(1);
        correctAnswer = aCorrectAnswer;
    }

    public boolean isCorrectAnswer(boolean possibleAnswer) {
        if (possibleAnswer == correctAnswer) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void displayAnswers() {
        System.out.println("True or False");
    }

    @Override
    public int getAnswers() {
        Scanner answer = new Scanner(System.in);
        System.out.println("What will your answer be? Type 't' for True or 'f' for False");
        String userAnswer = answer.nextLine();
        if (userAnswer.indexOf('t') >= 0) {
            if (isCorrectAnswer(true)) {
                return 1;
            } else {
                return 0;
            }
        } else {
            if (isCorrectAnswer(false)) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}
