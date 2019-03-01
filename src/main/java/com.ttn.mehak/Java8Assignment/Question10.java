package main.java.com.ttn.mehak.Java8Assignment;

//Sum all the numbers greater than 5 in the integer list.

import java.util.Arrays;
import java.util.List;

public class Question10 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 3, 6, 4, 8, 10, 1);

        int result =
                list.stream()   //generates stream
                        .filter(a -> a > 5)    //filters out elements greater than 5
                        .mapToInt(x -> x).sum();     //maps data to integer and adds them
        System.out.println(result);
    }
}
