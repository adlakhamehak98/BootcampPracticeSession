package main.java.com.ttn.mehak.Java8Assignment;

//Write the following a functional interface and implement it using lambda:
//(1) First number is greater than second number or not           Parameter (int ,int ) Return boolean
//(2) Increment the number by 1 and return incremented value      Parameter (int) Return int
//(3) Concatination of 2 string                                   Parameter (String , String ) Return (String)
//(4) Convert a string to uppercase and return .                  Parameter (String) Return (String)

@FunctionalInterface
interface IsGreaterThan {
    boolean isGreaterThan(int a, int b);
}

@FunctionalInterface
interface Incrementer {
    int incrementer(int a);
}

@FunctionalInterface
interface Concatenator {
    String concatenator(String a, String b);
}

@FunctionalInterface
interface UppercaseConv {
    String uppercaseConverter(String a);
}

public class Question1 {
    public static void main(String[] args) {
        IsGreaterThan object = (a, b) -> a > b;
        boolean result = object.isGreaterThan(3, 2);
        System.out.println(result);

        Incrementer object1 = a -> a + 1;
        System.out.println(object1.incrementer(7));

        Concatenator object2 = String::concat;
        System.out.println(object2.concatenator("Me", "hak"));

        UppercaseConv object3 = a -> a.toUpperCase();
        System.out.println(object3.uppercaseConverter("Mehak"));
    }
}