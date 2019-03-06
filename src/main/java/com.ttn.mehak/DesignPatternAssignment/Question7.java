package main.java.com.ttn.mehak.DesignPatternAssignment;

//Implement Composite Design Pattern to maintaining the directories of employees on the basis of departments.

interface Departments {
    void printDepartmentName();
}

class ITDepartment implements Departments {

    @Override
    public void printDepartmentName() {
        System.out.println("IT Department");
    }
}

class FinancialDepartment implements Departments {

    @Override
    public void printDepartmentName() {
        System.out.println("Financial Department");
    }
}

class SalesDepartment implements Departments {

    @Override
    public void printDepartmentName() {
        System.out.println("Sales Department");
    }
}

public class Question7 {
    public static void main(String[] args) {
        Departments departments1 = new SalesDepartment();
        departments1.printDepartmentName();

        Departments departments2 = new ITDepartment();
        departments2.printDepartmentName();
    }
}
