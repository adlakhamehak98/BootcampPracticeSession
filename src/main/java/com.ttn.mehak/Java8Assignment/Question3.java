package main.java.com.ttn.mehak.Java8Assignment;

//Using (instance) Method reference create and apply add and subtract method and using (Static) Method reference
// create and apply multiplication method for the functional interface created.

@FunctionalInterface
interface Compute{
    int operation(int a, int b);
}

public class Question3 {
    private int adder(int a, int b){
        System.out.println("The numbers are "+a+" and "+b);
        return a+b;
    }

    private int subtractor(int a, int b){
        System.out.println("The numbers are "+a+" and "+b);
        return a-b;
    }

    static int multiplier(int a, int b){
        System.out.println("The numbers are "+a+" and "+b);
        return a*b;
    }

    public static void main(String[] args) {
        Compute compute =new Question3()::adder;   //instance method reference
        int sum = compute.operation(2,4);
        System.out.println("The sum is: "+sum);
        System.out.println();

        Compute compute1 =new Question3()::subtractor;  //instance method reference
        int difference = compute1.operation(4,4);
        System.out.println("The difference is: "+difference);
        System.out.println();

        Compute compute2 =Question3::multiplier;   //static method reference
        int result = compute2.operation(5,4);
        System.out.println("The result of multiplication is: "+result);
    }
}
