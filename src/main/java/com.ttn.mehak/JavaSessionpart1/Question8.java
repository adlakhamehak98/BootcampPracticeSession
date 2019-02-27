package main.java.com.ttn.mehak.JavaSessionpart1;

//Write a program to reverse a string and remove character from index 4 to index 9 from the reversed string using String Buffer
public class Question8 {
    public static void main(String args[]) {
        StringBuffer reverseString = new StringBuffer("Hello my name is Mehak");
        System.out.println("String: " + reverseString);
        reverseString.reverse();
        System.out.println("Reversed String: " + reverseString);//prints reverse of string
        reverseString.delete(4, 9);
        System.out.println("String after deletion: " + reverseString);
    }
}
