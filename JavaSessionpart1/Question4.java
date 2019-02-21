package sessionpart1;

import java.util.Scanner;

// Calculate the number & Percentage Of Lowercase Letters,Uppercase Letters, Digits And Other Special Characters In A String
public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string = scanner.nextLine();
        System.out.println("The entered string is: " + string);
        int upperCase = 0;
        int lowerCase = 0;
        int digits = 0;
        int specialChars = 0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isUpperCase(string.charAt(i))) {        /**  using methods to check  every character and increasing corresponding counter by 1 **/
                upperCase = upperCase + 1;
            } else if (Character.isLowerCase(string.charAt(i))) {
                lowerCase = lowerCase + 1;
            } else if (Character.isDigit(string.charAt(i))) {
                digits = digits + 1;
            } else
                specialChars = specialChars + 1;
        }
        System.out.println("UPPERCASE COUNT: " + upperCase + " PERCENTAGE: " + (upperCase * 100) / string.length() + "%");
        System.out.println("LOWERCASE COUNT: " + lowerCase + " PERCENTAGE: " + (lowerCase * 100) / string.length() + "%");
        System.out.println("DIGITS COUNT: " + digits + " PERCENTAGE: " + (digits * 100) / string.length() + "%");
        System.out.println("SPECIAL CHARACTERS COUNT: " + specialChars + " PERCENTAGE: " + (specialChars * 100) / string.length() + "%");
    }
}

