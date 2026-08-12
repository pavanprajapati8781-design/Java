import java.util.Scanner;

class BankAccount {

    String accountNumber;
    double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient Funds");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

public class BankAccountApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input account details
        System.out.print("Enter Account Number: ");
        String accountNumber = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        BankAccount account = new BankAccount(accountNumber, balance);

        // Deposit
        System.out.print("Enter Deposit Amount: ");
        double depositAmount = sc.nextDouble();
        account.deposit(depositAmount);

        // Withdraw
        System.out.print("Enter Withdraw Amount: ");
        double withdrawAmount = sc.nextDouble();
        account.withdraw(withdrawAmount);

        // Check Balance
        account.checkBalance();

        // Withdraw more than balance
        System.out.print("Enter Another Withdraw Amount: ");
        double withdrawAmount2 = sc.nextDouble();
        account.withdraw(withdrawAmount2);

        // Final Balance
        account.checkBalance();

        sc.close();
    }
}