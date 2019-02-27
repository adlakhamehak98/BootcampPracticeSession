package main.java.com.ttn.mehak.CollectionAndDateAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//Write a program to sort the Student objects based on Score , if the score are same then sort on First Name .
// Class Student{ String Name; Double Score; Double Age
class Student {
    double Age;
    double Score;
    String Name;

    Student(String Name, double Age, double Score) {
        this.Name = Name;
        this.Age = Age;
        this.Score = Score;
    }

    public String toString() {
        return "[Student Name: " + Name + " Age: " + Age + " Score " + Score + " ]";
    }
}

class ScoreComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.Score < o2.Score) {
            return 1;
        } else if (o1.Score == o2.Score) {
            return o1.Name.compareTo(o2.Name);
        } else if (o1.Score > o2.Score) {
            return -1;
        } else
            return 0;
    }
}

public class Question5 {
    public static void main(String[] args) {
        Student stu1 = new Student("Sagar", 22, 89);
        Student stu2 = new Student("Mehak", 21, 98);
        Student stu3 = new Student("Sid", 22, 49);
        Student stu4 = new Student("Gaurav", 22, 50);
        Student stu5 = new Student("Kirti", 22, 50);
        Student stu6 = new Student("Bhavna", 22, 67);


        ArrayList stuData = new ArrayList();
        stuData.add(stu1);
        stuData.add(stu2);
        stuData.add(stu3);
        stuData.add(stu4);
        stuData.add(stu5);
        stuData.add(stu6);

        System.out.println("Before sorting:");
        System.out.println(stuData);

        System.out.println("After sorting:");
        Collections.sort(stuData, new ScoreComparator());
        System.out.println(stuData);
    }

}
