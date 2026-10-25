
class Employee {
    // Private instance variables
    private int empId;
    private String name;
    private String department;

    // Setter for empId
    public void setEmpId(int empId) {
        this.empId = empId;
    }

    // Getter for empId
    public int getEmpId() {
        return empId;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for department
    public void setDepartment(String department) {
        this.department = department;
    }

    // Getter for department
    public String getDepartment() {
        return department;
    }

    public static void main(String[] args) {
        Employee e = new Employee();

        // Set values using setters
        e.setEmpId(101);
        e.setName("Pratham");
        e.setDepartment("IT");

        // Print details using getters
        System.out.println("Employee ID: " + e.getEmpId());
        System.out.println("Name: " + e.getName());
        System.out.println("Department: " + e.getDepartment());
    }
}
