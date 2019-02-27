package main.java.com.ttn.mehak.JavaSessionpart1;

//Write a program to print your Firstname,LastName & age using static block,static method & static variable respectively
public class Question7 {

    static {
        String firstName = "Mehak";
        String lastname = "Adlakha";                                     //static block
        int age = 21;
        System.out.println("Static block:::" + firstName + " " + lastname + " ," + "AGE- " + age);
    }

    static String firstName = "Mehak"; //static variable
    static String lastname = "Adlakha"; //static variable
    static int age = 21; //static variable

    void display() {
        System.out.println("Static variable:::" + firstName + " " + lastname + " ," + "AGE- " + age);
    }

    static void staticDisplay() {
        System.out.println("Static method:::" + firstName + " " + lastname + " ," + "AGE- " + age);//static method
    }


    public static void main(String[] args) {
        Question7 staticVariable = new Question7();
        staticVariable.display();

        staticVariable.staticDisplay();
    }
}
