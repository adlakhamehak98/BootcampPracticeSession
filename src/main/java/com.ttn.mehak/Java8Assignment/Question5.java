package main.java.com.ttn.mehak.Java8Assignment;

//Implement following functional interfaces from java.util.function using lambdas:
//
//(1) Consumer
//
//(2) Supplier
//
//(3) Predicate
//
//(4) Function

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Question5 {
    private static void printMe(Supplier<String> supplier) {
        System.out.println(supplier.get());
    }

    public static void main(String[] args) {
        //consumer
        Consumer<String> consumer = string -> System.out.println("The entered string is: " + string);
        consumer.accept("Hello Newers");

        //supplier
        String str = "This is a supplier.";
        printMe(() -> str);

        //Predicate
        Predicate<Integer> predicate = integer-> integer > 10;
        System.out.println(predicate.test(6));

        //Function
        Function<Integer,Integer> function = a-> a+10;
        System.out.println("After adding 10: "+function.apply(7));
    }
}
