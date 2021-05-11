package org.launchcode.java.studios.inheritanceStudio;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class CheckBox extends Question {

    private ArrayList<String> possibleAnswers;
    private ArrayList<Integer> correctAnswers;

    public CheckBox(String aQuestion, int aPointValue, ArrayList<String> possibleAnswers, ArrayList<Integer> correctAnswers) {
        super(aQuestion, aPointValue);
        this.correctAnswers = correctAnswers;
        this.possibleAnswers = possibleAnswers;
        setPointValue(this.correctAnswers.size());
    }

    public int checkAnswers(ArrayList<Integer> check) {
        int answersCorrect = 0;
        for (int i = 0; i < check.size(); i++) {
            if(correctAnswers.contains(check.get(i))) {
                answersCorrect ++;
            }
        }
        return answersCorrect;
    };

    @Override
    public void displayAnswers() {
        for (int i = 0; i < possibleAnswers.size(); i++) {
            System.out.println(possibleAnswers.get(i));
        }
    }

    @Override
    public int getAnswers() {
        ArrayList<Integer> usersAnswers = new ArrayList<>();
        System.out.println(("For this question, there are multiple correct answers. To begin answering the questions, enter 'y'."));
        Scanner userContinue = new Scanner(System.in);
        String goingToContinue = userContinue.nextLine();
        while (goingToContinue.indexOf('y') >= 0 && usersAnswers.size() <= possibleAnswers.size()) {
            System.out.println("What will your answer be? Enter the number of the option you believe is correct.");
            Scanner userAnswer = new Scanner(System.in);
            String answer = userAnswer.nextLine();
            int option = Integer.parseInt(answer);
            usersAnswers.add(option);

            System.out.println("For this questions, there are multiple correct ansers. To continue answering the question, enter 'y'.");
            goingToContinue = userContinue.nextLine();
        }
        return checkAnswers(usersAnswers);
    }
}
