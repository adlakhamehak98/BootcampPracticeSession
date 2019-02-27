
//Write a method that takes a string and print the number of occurrence of each character characters in the string.
package main.java.com.ttn.mehak.CollectionAndDateAssignment;
import java.util.HashMap;
import java.util.Scanner;

public class Question3 {
    private static void occurences(String str) {
        int[] count = new int[256]; //create an array of size 256
        HashMap<Character, Integer> map = new HashMap<>();
        /* Count array with frequency of characters */
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                count[(int) str.charAt(i)]++;
            }
        }
        //add count array to map to store distinct values of key i.e., characters
        for (int i = 0; i < str.length(); i++)
            map.put(str.charAt(i), count[(int) str.charAt(i)]);

        //print map
        for (HashMap.Entry m : map.entrySet()) {
            System.out.println("Character: " + m.getKey() + " ,Number of occurences: " + m.getValue());
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        occurences(str);
    }
}