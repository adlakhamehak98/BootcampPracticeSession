package main.java.com.ttn.mehak.Java8Assignment;

//Override the default method of the interface.

interface MyInterface {
    default void display() {
        System.out.println("I am interface default method");

    }
}

public class Question7 implements MyInterface {

    @Override
    public void display() {
        System.out.println("I am overridden default method");
    }

    public static void main(String[] args) {
            Question7 question7 = new Question7();
            question7.display();
    }
}

