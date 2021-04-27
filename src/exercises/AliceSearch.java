package exercises;

import java.util.Scanner;

public class AliceSearch {
    public static void main(String[] args) {
        String alice = ("Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice " +
                "'without pictures or conversation?'");

        Scanner input = new Scanner(System.in);
        System.out.println("What word would you like to search? ");
        String searchWord = input.nextLine();

        input.close();

        double lengthOfSearchWord = searchWord.length();
        double indexOfSearchWord = alice.indexOf(searchWord);
        String newAlice = alice.replace(searchWord, "");

        if (alice.contains(searchWord)) {
            System.out.println("This passage contains your search word.");
            System.out.println("Your search word is at index: " + indexOfSearchWord + " and is " + lengthOfSearchWord + " letters long.");
            System.out.println(newAlice);
        } else {
            System.out.println("Your search word is not in this passage.");
        }
    }
}