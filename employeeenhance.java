
class employeeenhance {
    private int empId;
    private String name;
    private String department;
    private double salary;

    // Setter methods
    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // Salary setter with validation
    public void setSalary(double salary) {
        if (salary < 0) {
            System.out.println("Error: Salary cannot be negative.");
            this.salary = 15000.0;
        } else {
            this.salary = salary;
        }
    }

    // Getter methods
    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        employeeenhance e = new employeeenhance();

        e.setEmpId(101);
        e.setName("Pratham");
        e.setDepartment("IT");

        // Test with valid salary
        e.setSalary(25000.0);
        System.out.println("Valid Salary: " + e.getSalary());

        // Test with invalid negative salary
        e.setSalary(-5000.0);
        System.out.println("Final Salary: " + e.getSalary());
    }
}
