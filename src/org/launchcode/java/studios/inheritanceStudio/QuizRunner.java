package org.launchcode.java.studios.inheritanceStudio;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class QuizRunner {
    public static void main(String[] args) {
    Quiz myQuiz = new Quiz(new ArrayList<>());
    ArrayList<String> possAns1 = new ArrayList<>(Arrays.asList("Garfield", "Salem", "Cheshire", "Tom"));
    ArrayList<Integer> correctAns1 = new ArrayList<>(Arrays.asList(2,3));
    CheckBox newQuestion1 = new CheckBox("Which cat is best?", 2, possAns1, correctAns1);
    myQuiz.addQuestion(newQuestion1);

    ArrayList<String> possAns2 = new ArrayList<>(Arrays.asList("Doc", "Tillie", "Gizmo", "Benji", "Nala"));
    MultipleChoice newQuestion2 = new MultipleChoice( "Who won the Halloween Costume contest?", 1, possAns2, 3);
    myQuiz.addQuestion(newQuestion2);

    TrueFalse newQuestion3 = new TrueFalse("Are all dogs the best?", 1, true);
    myQuiz.addQuestion(newQuestion3);

    myQuiz.runQuiz();
    myQuiz.gradeQuiz();
    }
}
