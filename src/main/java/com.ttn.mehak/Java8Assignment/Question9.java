package main.java.com.ttn.mehak.Java8Assignment;

//Collect all the even numbers from an integer list.

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Question9 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(23);
        list.add(38);
        list.add(4);
        list.add(576);
        list.add(165);
        list.add(21);
        list.add(60);
        list.add(101);
        list.add(900);
        List<Integer> resultlist = list.stream()   //generates stream
                .filter(a -> a%2 == 0)             //filters out even data, is a predicate(intermediate function)
                .collect(Collectors.toList());     //collects result to list(terminating function)
        for (int a :resultlist) System.out.println(a);    //foreach loop
    }
}
