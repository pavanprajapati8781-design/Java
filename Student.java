import java.util.Scanner;

class Student {

    String name;
    int rollNo;
    char grade;

    void displayInfo() {
        System.out.println("\nStudent Details");
        System.out.println("Name : " + name);
        System.out.println("Roll No : " + rollNo);
        System.out.println("Grade : " + grade);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student s1 = new Student();
        Student s2 = new Student();

        // Input for first student
        System.out.println("Enter details of Student 1");
        System.out.print("Name: ");
        s1.name = sc.nextLine();
        System.out.print("Roll No: ");
        s1.rollNo = sc.nextInt();
        System.out.print("Grade: ");
        s1.grade = sc.next().charAt(0);
        sc.nextLine();

        // Input for second student
        System.out.println("\nEnter details of Student 2");
        System.out.print("Name: ");
        s2.name = sc.nextLine();
        System.out.print("Roll No: ");
        s2.rollNo = sc.nextInt();
        System.out.print("Grade: ");
        s2.grade = sc.next().charAt(0);

        // Display details
        s1.displayInfo();
        s2.displayInfo();

        sc.close();
    }
}