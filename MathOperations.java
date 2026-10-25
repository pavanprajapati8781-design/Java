
class MathOperations {

    // 1. Multiply two integers
    int multiply(int a, int b) {
        return a * b;
    }

    // 2. Multiply three integers
    int multiply(int a, int b, int c) {
        return a * b * c;
    }

    // 3. Multiply two double values
    double multiply(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {
        MathOperations obj = new MathOperations();

        // Call all three overloaded methods
        System.out.println("Product of two integers: "
                + obj.multiply(5, 4));

        System.out.println("Product of three integers: "
                + obj.multiply(2, 3, 4));

        System.out.println("Product of two double values: "
                + obj.multiply(2.5, 4.0));
    }
}
