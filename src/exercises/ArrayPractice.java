package exercises;

import java.io.*;
import java.util.*;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] randomArray = {1, 1, 2, 3, 5, 8};
        for (int i = 0; i < randomArray.length; i++) {
            if (randomArray[i]%2!=0)
            System.out.println(randomArray[i]);
        }
        String rhyme = "I would not, could not, in a box. " +
                "I would not, could not with a fox. " +
                "I will not eat them in a house. " +
                "I will not eat them with a mouse.";
        String[] splitRhyme = rhyme.split(" ");
        String[] splitBySentence = rhyme.split("\\.");
        System.out.println(Arrays.toString(splitRhyme));
        System.out.print(Arrays.toString(splitBySentence));
    }
}
