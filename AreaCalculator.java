//

class AreaCalculator {

    // 1. Calculate area of a square
    double calculateArea(double side) {
        return side * side;
    }

    // 2. Calculate area of a rectangle
    double calculateArea(double length, double width) {
        return length * width;
    }

    // 3. Calculate area of a circle
    double calculateArea(float radius) {
        return 3.14 * radius * radius;
    }

    public static void main(String[] args) {
        AreaCalculator obj = new AreaCalculator();

        // Area of square
        System.out.println("Area of Square: "
                + obj.calculateArea(5.0));

        // Area of rectangle
        System.out.println("Area of Rectangle: "
                + obj.calculateArea(6.0, 4.0));

        // Area of circle
        System.out.println("Area of Circle: "
                + obj.calculateArea(3.0f));
    }
}
