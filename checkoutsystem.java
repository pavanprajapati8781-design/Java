import java.util.Scanner;

public class checkoutsystem{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        String membership;
        float cart ; 
        float discount = 0;
        float finalPrice = 0;

        System.out.print("Enter Membership (Regular/Premium/VIP): ");
        membership = sc.next();

        System.out.print("Enter Cart Value: ");
        cart = sc.nextFloat();

        discount = 0;

        if (cart < 100) {
            discount = 0;
        } 
        else if (cart <= 500) {

            switch (membership.toLowerCase()) {
                case "regular":
                    discount = 5;
                    break;

                case "premium":
                    discount = 10;
                    break;

                case "vip":
                    discount = 15;
                    break;

                default:
                    System.out.println("Invalid Membership!");
                    return;
            }

        } else { // cart > 500

            switch (membership.toLowerCase()) {
                case "regular":
                    discount = 15;
                    break;

                case "premium":
                    discount = 20;
                    break;

                case "vip":
                    discount = 25;
                    break;

                default:
                    System.out.println("Invalid Membership!");
                    return;
            }
        }

        finalPrice = cart - (cart * discount / 100);

        System.out.println("Discount = " + discount + "%");
        System.out.println("Final Price = " + finalPrice);

        sc.close();
    }
}