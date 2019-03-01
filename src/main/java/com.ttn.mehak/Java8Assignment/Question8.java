package main.java.com.ttn.mehak.Java8Assignment;

//Implement multiple inheritance with default method inside  interface.

interface MyInterface1 {
    default void display() {
        System.out.println("I am interface '1' default method");
    }
}

interface MyInterface2 {
    default void display() {
        System.out.println("I am interface '2' default method");
    }
}

public class Question8 implements MyInterface1, MyInterface2 {
    public void display() {
        //calls interface 1 method
        MyInterface1.super.display();
        //calls interface 2 method
        MyInterface2.super.display();
    }

    public static void main(String[] args) {
        Question8 question8 = new Question8();
        question8.display();
    }
}
