package sessionpart2;

import java.util.Scanner;
//WAP to read words from the keyboard until the word done is entered. For each word except done,
// report whether its first character is equal to its last character. For the required loop, use a
//a)while statement
//b)do-while statement



//this is part b) do-while statement
public class Question8B {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = keyboard.next();
        do {
            if (word.charAt(0) == word.charAt(word.length() - 1)) //matching first and last letter of each word
                System.out.println("First and last character are equal for the word: " + word);
            word = keyboard.next();
        } while (!word.equals("done"));
    }
}
