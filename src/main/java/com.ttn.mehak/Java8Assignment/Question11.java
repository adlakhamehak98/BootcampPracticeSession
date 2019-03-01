package main.java.com.ttn.mehak.Java8Assignment;

//Find average of the number inside integer list after doubling it.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question11 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(36, 12, 43, 12, 8);
        System.out.println(
                list.stream()
                        .collect(Collectors.averagingInt(x -> x * 2)) //first multiplies elements by 2 then finds out avg
        );
    }
}
