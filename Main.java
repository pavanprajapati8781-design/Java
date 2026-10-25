// single inheritance example in Java

class Vehicle {
    String brand;

    // Method of the base class
    void start() {
        System.out.println("The vehicle is starting");
    }
}

class Car extends Vehicle {
    String modelName;

    // Method of the derived class
    void accelerate() {
        System.out.println("The car is accelerating");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an object of Car
        Car c = new Car();

        // Assign values
        c.brand = "Toyota";
        c.modelName = "Fortuner";

        // Display details
        System.out.println("Brand: " + c.brand);
        System.out.println("Model: " + c.modelName);

        // Call both methods using the same object
        c.start();
        c.accelerate();
    }
}
