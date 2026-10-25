import java.util.Scanner;

public class rapidoservice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ride type (Poor/Standard/Luxury): ");
        String type = sc.next();

        System.out.print("Enter distance (km): ");
        double distance = sc.nextDouble();

        System.out.print("Enter hour (0-23): ");
        int hour = sc.nextInt();

        double rate = 0;

        switch (type.toLowerCase()) {
            case "poor":
                rate = 1;
                break;

            case "standard":
                rate = 1.5;
                break;

            case "luxury":
                rate = 3;
                break;

            default:
                System.out.println("Invalid Ride Type");
                return;
        }

        // Check peak hours
        if ((hour >= 8 && hour < 10) || (hour >= 17 && hour < 19)) {
            rate = rate * 1.5;
        }

        double fare = rate * distance;

        // Minimum fare
        if (fare < 5) {
            fare = 5;
        }

        System.out.println("Total Fare = ₹" + fare);

        sc.close();
    }
}