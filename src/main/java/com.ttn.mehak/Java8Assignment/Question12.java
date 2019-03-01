package main.java.com.ttn.mehak.Java8Assignment;

//Find the first even number in the integer list which is greater than 3.

import java.util.Arrays;
import java.util.List;

public class Question12 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 8, 0, 4, 5);
        System.out.println(
                list.stream()
                        .filter(e -> e > 3) //filters elements greater than 3
                        .filter(e -> e % 2 == 0)  //filters elements that are even
                        .findFirst()   //finds the first element qualified
        );
    }
}
