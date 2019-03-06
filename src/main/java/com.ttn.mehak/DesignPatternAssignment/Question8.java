package main.java.com.ttn.mehak.DesignPatternAssignment;

//Implement proxy design for accessing Record of a student and allow the access only to Admin.

import java.util.Scanner;

interface Students{
    String getDetails(String accessor);
}

class StudentRecordProxy implements Students{
    int RollNumber;
    String Name;
    int Age;

    public StudentRecordProxy(int rollNumber, String name, int age) {
        RollNumber = rollNumber;
        Name = name;
        Age = age;
    }

    @Override
    public String getDetails(String accessor) {
        if(accessor.equalsIgnoreCase("Admin"))
        return "Student Name: "+Name+" ,Roll Number: "+RollNumber+" ,Age: "+Age;
        else
            return "Access denied for "+accessor+".";
    }
}

public class Question8 {
    public static void main(String[] args) {
        System.out.println("Please enter your Designation:");
        StudentRecordProxy student1 = new StudentRecordProxy(01,"Mehak Adlakha",21);
        StudentRecordProxy student2 = new StudentRecordProxy(02,"Siddarth Gupta",22);
        StudentRecordProxy student3 = new StudentRecordProxy(03,"Gaurav Gandhi",21);
        StudentRecordProxy student4 = new StudentRecordProxy(04,"Moksh Sharma",23);
        Scanner scanner= new Scanner(System.in);
        String accessor = scanner.nextLine();
        System.out.println("Enter student roll number:");
        Scanner sc = new Scanner(System.in);
        int roll = sc.nextInt();
        if(roll==01)
        System.out.println(student1.getDetails(accessor));
        else if (roll==02)
            System.out.println(student2.getDetails(accessor));
        else if (roll==03)
            System.out.println(student3.getDetails(accessor));
        else if (roll==04)
            System.out.println(student4.getDetails(accessor));
        else
            System.out.println("Student doesn't exist.");

    }
}
