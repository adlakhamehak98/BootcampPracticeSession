import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//Write a program to sort Employee objects based on highest salary using Comparator.
// Employee class{ Double Age; Double Salary; String Name
class Employee {
    double Age;
    double Salary;
    String Name;

    Employee(String Name, double Age, double Salary) {
        this.Name = Name;
        this.Age = Age;
        this.Salary = Salary;
    }

    public String toString() {
        return "[Employee Name: " + Name + " Age: " + Age + " Salary " + Salary + " ]";
    }
}

class SalaryComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.Salary < o2.Salary) {
            return 1;
        } else if (o1.Salary > o2.Salary) {
            return -1;
        } else
            return 0;
    }
}

public class Question4 {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Sagar", 22, 15000);
        Employee emp2 = new Employee("Mehak", 21, 20100);
        Employee emp3 = new Employee("Gandhi", 22, 15100);
        Employee emp4 = new Employee("Siddharth", 23, 15100);

        ArrayList empData = new ArrayList();
        empData.add(emp1);
        empData.add(emp2);
        empData.add(emp3);
        empData.add(emp4);

        System.out.println("Before sorting:");
        System.out.println(empData);

        System.out.println("After sorting:");
        Collections.sort(empData, new SalaryComparator());
        System.out.println(empData);
    }
}
