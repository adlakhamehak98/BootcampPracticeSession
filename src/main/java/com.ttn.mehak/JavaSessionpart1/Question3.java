package main.java.com.ttn.mehak.JavaSessionpart1;

import java.util.Scanner;

//Write a program to find the number of occurrences of a character in a string without using loop?
public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string = scanner.nextLine();
        System.out.println("The entered string is: " + string);
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose a character out of the string to be counted: ");
        char character = sc.next().charAt(0);
        int countOfChar = string.length() - string.replaceAll(String.valueOf(character), "").length();//replacing counted character by blank and removing from original length
        System.out.println(character + " occurs " + countOfChar + " times in " + string);
        sc.close();
    }
}
