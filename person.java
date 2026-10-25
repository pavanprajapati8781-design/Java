
class Person {
    String name;
    int age;

    // Method to display person details
    void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Employee extends Person {
    int empId;

    // Method to display employee details
    void displayEmployeeDetails() {
        displayPersonDetails();
        System.out.println("Employee ID: " + empId);
    }
}

class Manager extends Employee {
    String department;

    // Display all details from all three levels
    void printAllDetails() {
        System.out.println("----- Manager Details -----");
        displayEmployeeDetails();
        System.out.println("Department: " + department);
        System.out.println("---------------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create Manager object
        Manager m = new Manager();

        // Set properties from all three levels
        m.name = "Pratham";
        m.age = 21;
        m.empId = 101;
        m.department = "IT";

        // Display all details
        m.printAllDetails();
    }
}
