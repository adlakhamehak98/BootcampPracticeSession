package main.java.com.ttn.mehak.sessionpart2;

// WAP to show object cloning in java using cloneable and copy constructor both.
public class Question5 implements Cloneable { //otherwise clone() method generates CloneNotSupportedException
    int empId;
    String name;

    Question5(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    // Overriding the toString of Object class
    public String toString() {
        return empId + " " + name;
    }

    // copy constructor
    Question5(Question5 question5) {
        System.out.println("Copy constructor called");
        empId = question5.empId;
        name = question5.name;
    }

    public static void main(String args[]) {
        try {
            Question5 s1 = new Question5(3301, "Mehak");

            Question5 s2 = (Question5) s1.clone();

            System.out.println(s1);
            System.out.println(s2);

            Question5 s3 = new Question5(3322, "Gandhi");
            System.out.println();
            System.out.println(s3);
            Question5 s4 = new Question5(s3); //copy constructor is called
            System.out.println(s4); //toString() is called

        } catch (CloneNotSupportedException c) {
        }
    }
}
