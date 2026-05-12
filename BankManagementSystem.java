import java.util.Scanner;

class BankAccount {

    String accountHolder;
    double balance;

    BankAccount(String name, double amount) {
        accountHolder = name;
        balance = amount;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Amount Deposited Successfully!");
    }

    void withdraw(double amount) {

        if (amount > balance) {
            System.out.println("Insufficient Balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawal Successful!");
        }
    }

    void displayBalance() {
        System.out.println("\nAccount Holder: " + accountHolder);
        System.out.println("Current Balance: ₹" + balance);
    }
}

public class BankManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Account Holder Name:");
        String name = sc.nextLine();

        System.out.println("Enter Initial Deposit Amount:");
        double amount = sc.nextDouble();

        BankAccount account = new BankAccount(name, amount);

        int choice;

        do {
            System.out.println("\n===== BANK MENU =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            System.out.print("Enter Your Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Deposit Amount: ");
                    double deposit = sc.nextDouble();
                    account.deposit(deposit);
                    break;

                case 2:
                    System.out.print("Enter Withdrawal Amount: ");
                    double withdraw = sc.nextDouble();
                    account.withdraw(withdraw);
                    break;

                case 3:
                    account.displayBalance();
                    break;

                case 4:
                    System.out.println("Thank You for Using the Bank System!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}
