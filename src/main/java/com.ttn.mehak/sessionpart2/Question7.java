package main.java.com.ttn.mehak.sessionpart2;

//WAP to convert seconds into days, hours, minutes and seconds.

import java.util.Scanner;

public class Question7 {

        // function to convert second into days, hours, minutes and seconds
        static void ConvertSec(int n) {//n must be in seconds
            int day = n / (24 * 3600); //Number of days = ⌊ n / (24 * 3600) ⌋

            n = n % (24 * 3600); //Number of Hours = ⌊ (n % (24 * 3600)) / 3600 ⌋
            int hour = n / 3600;

            n %= 3600;
            int minutes = n / 60 ; //Number of Minutes = ⌊ (n % (24 * 3600 * 3600)) / 60 ⌋

            n %= 60;
            int seconds = n; //Number of Seconds = ⌊ (n % (24 * 3600 * 3600 * 60)) / 60 ⌋

            System.out.println( day + " " + "days " + hour
                    + " " + "hours " + minutes + " "
                    + "minutes " + seconds + " "
                    + "seconds ");
        }

        public static void main (String[] args)
        {
            // Given n is in seconds
            System.out.println("Input seconds:");
            Scanner scanner = new Scanner(System.in);
            int n =scanner.nextInt();
            System.out.println("Conversion: ");
            ConvertSec(n);

        }
}