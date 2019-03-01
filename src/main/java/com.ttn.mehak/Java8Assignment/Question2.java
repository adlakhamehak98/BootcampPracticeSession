package main.java.com.ttn.mehak.Java8Assignment;

//Create a functional interface whose method takes 2 integers and return one integer.

import java.util.function.BiFunction;

@FunctionalInterface
interface Adder {
    int sum(int a, int b);
}

public class Question2 {
    public static void main(String[] args) {
        Adder adder = (a, b) -> a + b;
        int result = adder.sum(6, 3);
        System.out.println("The sum is " + result);

        //using BiFunction functional interface:
        BiFunction<Integer, Integer, Integer> biFunction = (a, b) -> a + b;
        int result1 = biFunction.apply(1, 9);
        System.out.println("The sum is " + result1);
    }
}
