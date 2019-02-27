package main.java.com.ttn.mehak.sessionpart2.Question1;
//Create Java classes having suitable attributes for Library management system.Use OOPs concepts in your design.Also try to use interfaces and abstract classes.
import java.util.*;
//Main class
public class Parent{
    public static void main(String[] args) {
        Student student = new Student();
        Scanner s=new Scanner(System.in);
        Library lb1=new Library();
        lb1.show();
        lb1.showBooks();
        System.out.println("\nEnter the Student Name and ID");
        String name=s.nextLine();
        String id=s.next();
        s.nextLine();
        System.out.println("Enter Book Name and Book id");
        String bookname=s.nextLine();
        String id1=s.next();
        System.out.println("Enter the author name");
        s.nextLine();

        String author1=s.nextLine();

        System.out.println("Enter issue date");
        String issu=s.nextLine();
        System.out.println("Enter the return date");
        String ret=s.nextLine();
        lb1.set(name,id,bookname,id1,author1,issu,ret,student);
        System.out.println("\n Press 1 to display the record of issuer");
        int ch=s.nextInt();
        if(ch==1){
            lb1.getDetail(student);
        }
        else
        {
            System.exit(0);
        }
    }
}
