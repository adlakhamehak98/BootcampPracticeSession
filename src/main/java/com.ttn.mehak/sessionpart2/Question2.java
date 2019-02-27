package main.java.com.ttn.mehak.sessionpart2;

import java.util.Scanner;

//WAP to sorting string without using string Methods?
public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");//considering lowercase string is added by default
        String input = sc.nextLine();
        System.out.println("Original string is:\n" + input);
        String output = sortString(input);
        System.out.println("After Sort string:\n" + output);
    }

    public static String sortString(String input) {
        char temp;
        char[] charArray;
        charArray = input.toCharArray(); //converting string to char array
        for (int i = 0; i < charArray.length; i++) {
            for (int j = 0; j < charArray.length - 1; j++) {
                if (charArray[j] > charArray[j + 1]) { //comparison according to ascii
                    temp = charArray[j];
                    charArray[j] = charArray[j + 1];
                    charArray[j + 1] = temp; //swapping values according to ascii
                }
            }
        }
        return new String(charArray);
    }
}