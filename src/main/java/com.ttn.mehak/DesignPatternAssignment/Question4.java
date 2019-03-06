package main.java.com.ttn.mehak.DesignPatternAssignment;

//Implement Builder pattern to create a student object with more than 6 fields.

class Student {
    private String firstName;
    private String lastName;
    private String middleName;
    private int rollNumber;
    private int age;
    private String classAndSection;
    private String address;
    private String email;
    private String fatherEmail;

    private Student(StudentBuilder student) {
        this.firstName = student.firstName;
        this.lastName = student.lastName;
        this.middleName = student.middleName;
        this.rollNumber = student.rollNumber;
        this.age = student.age;
        this.classAndSection = student.classAndSection;
        this.address = student.address;
        this.email = student.email;
        this.fatherEmail = student.fatherEmail;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", rollNumber=" + rollNumber +
                ", age=" + age +
                ", classAndSection='" + classAndSection + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", fatherEmail='" + fatherEmail + '\'' +
                '}';
    }

    public static class StudentBuilder {
        private String firstName;
        private String lastName;
        private String middleName;
        private int rollNumber;
        private int age;
        private String classAndSection;
        private String address;
        private String email;
        private String fatherEmail;

        StudentBuilder(String firstName, int age, String classAndSection, String address) {
            this.firstName = firstName;
            this.age = age;
            this.classAndSection = classAndSection;
            this.address = address;
        }

        public StudentBuilder withEmail(String email) {
            this.email = email;
            return this;
        }

        public StudentBuilder withFatherEmail(String fatherEmail) {
            this.fatherEmail = fatherEmail;
            return this;
        }

        public StudentBuilder withMiddleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public StudentBuilder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public StudentBuilder withRollNumber(int rollNumber) {
            this.rollNumber = rollNumber;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }
}

public class Question4 {
    public static void main(String[] args) {
        Student student = new Student
                .StudentBuilder("Mehak", 18, "12 Non-Medical", "#70 Mall Road, Ambala")
                .withEmail("mehakadlakha@tothenew.com")
                .withFatherEmail("adlakhasanju71@gmail.com")
                .withRollNumber(33)
                .build();

        System.out.println(student.toString());
    }
}
