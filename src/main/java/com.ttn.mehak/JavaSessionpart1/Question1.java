package main.java.com.ttn.mehak.JavaSessionpart1;

//Write a program to replace a substring inside a string with other string ?
public class Question1 {
    public static void main(String[] args) {
        String str = "Hello newers!";
        String substr = "Hello blanewers!";
        String substr1 = str.replace("newers", substr);
        System.out.println("Old string: " + str);
        System.out.println("New string: " + substr1);
    }
}
