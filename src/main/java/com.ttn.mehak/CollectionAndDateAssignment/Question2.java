//Write a method that takes a string and returns the number of unique characters in the string.
package main.java.com.ttn.mehak.CollectionAndDateAssignment;
import java.util.HashSet;
import java.util.Scanner;

public class Question2 {

    private static HashSet uniqueChars(String str) {
        char[] chars = str.toCharArray();
        HashSet set = new HashSet();

        for (char aChar : chars) {
            if (set.contains(aChar)) { //if element is already present means it is not unique so remove previous one
                set.remove(aChar);
            } else {
                set.add(aChar); //add unique element
            }
        }
        System.out.println("Count of unique characters: " + set.size());
        return set;
    }

    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println("Unique characters in the string: " + uniqueChars(str));
    }
}
