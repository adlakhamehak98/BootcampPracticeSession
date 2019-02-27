package main.java.com.ttn.mehak.JavaSessionpart1;

//Write a single program for following operation using overloading
//  A) Adding 2 integer number
//  B) Adding 2 double
//  C) multiplying 2 float
//  D) multiplying 2 int
//  E) concate 2 string
//  F) Concate 3 String
public class Question10 {
    static int add(int a, int b) { //  A) Adding 2 integer number
        return a + b;
    }

    static double add(double a, double b) { //  B) Adding 2 double
        return a + b;
    }

    static int multiply(int a, int b) { //  D) multiplying 2 int
        return a * b;
    }

    static float multiply(float a, float b) { //  C) multiplying 2 float
        return a * b;
    }

    static String concat(String a, String b) { //  E) concate 2 string
        return a.concat(b);
    }

    static String concat(String a, String b, String c) { //  F) concate 3 string
        String intermediate;
        intermediate = a.concat(b);
        return intermediate.concat(c);
    }

    public static void main(String[] args) {
        System.out.println("Addition:");
        System.out.println(Question10.add(11, 11));
        System.out.println(Question10.add(11.9, 11.5));

        System.out.println("Multiplication:");
        System.out.println(Question10.multiply(11, 11));
        System.out.println(Question10.multiply(11.14f, 11.2f));

        System.out.println("Concatenation:");
        System.out.println(Question10.concat("Hello", " Newers"));
        System.out.println(Question10.concat("Hello", " Newers", " Bye"));
    }
}
