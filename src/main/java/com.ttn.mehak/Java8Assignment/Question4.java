package main.java.com.ttn.mehak.Java8Assignment;

//Create an Employee Class with instance variables (String) name,
// (Integer)age, (String)city and get the instance of the Class using constructor reference

class Employee {
    String name;
    int age;
    String city;

    public Employee(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public String toString() {
        return "Name: " + name + " ,Age: " + age + " ,City: " + city;
    }

}

interface EmployeesData {
    Employee getEmployee(String name, int age, String city);
}

public class Question4 {
    public static void main(String[] args) {
        EmployeesData employeesData = Employee::new;
        Employee emp = employeesData.getEmployee("Mohan Das", 49, "Noida");
        System.out.println(emp);
    }
}
