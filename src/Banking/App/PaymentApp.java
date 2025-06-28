package Banking.App;

import Banking.Model.User;
import Banking.Model.Account;
import Banking.Model.Transaction;
import Banking.Payment.*;
import Banking.Services.Bank;

import java.util.List;
import java.util.Scanner;

public class PaymentApp {
    static Bank bank = new Bank();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("=== Welcome to CLI Banking App ===");

        while (true) {
            System.out.println("\n1. Register\n2. Login\n3. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> register();
                case 2 -> {
                    User user = login();
                    if (user != null) dashboard(user);
                }
                case 3 -> {
                    System.out.println("Thank you for banking with us.");
                    return;
                }
                default -> System.out.println("Invalid option.");
            }
        }
    }

    private static void register() {
        System.out.print("Enter username: ");
        String user = sc.nextLine();
        System.out.print("Enter password: ");
        String pass = sc.nextLine();
        bank.registerUser(user, pass);
    }

    private static User login() {
        System.out.print("Enter username: ");
        String user = sc.nextLine();
        System.out.print("Enter password: ");
        String pass = sc.nextLine();
        return bank.loginUser(user, pass);
    }

    private static void dashboard(User user) {
        Account acc = user.getAccount();

        while (true) {
            System.out.println("\n--- Dashboard ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. View Last 5 Transactions");
            System.out.println("5. Make Payment");
            System.out.println("6. Logout");
            System.out.print("Choose: ");
            int option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1 -> System.out.println("Balance: ₹" + acc.getBalance());
                case 2 -> {
                    System.out.print("Amount to deposit: ");
                    double amt = sc.nextDouble();
                    sc.nextLine();
                    acc.deposit(amt);
                }
                case 3 -> {
                    System.out.print("Amount to withdraw: ");
                    double amt = sc.nextDouble();
                    sc.nextLine();
                    if (acc.withdraw(amt)) {
                        acc.addTransaction(new Transaction(amt, "debit", "ATM"));
                        System.out.println("Withdrawal successful.");
                    }
                }
                case 4 -> {
                    List<Transaction> txs = acc.getRecentTransactions();
                    if (txs.isEmpty()) System.out.println("No transactions.");
                    else txs.forEach(System.out::println);
                }
                case 5 -> {
                    System.out.print("Amount to pay: ");
                    double amt = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("1. CreditCard  2. UPI");
                    int ch = sc.nextInt();
                    sc.nextLine();
                    Payment method = switch (ch) {
                        case 1 -> new CreditCard();
                        case 2 -> new UPI();
                        default -> null;
                    };
                    if (method != null) method.pay(amt, acc);
                    else System.out.println("Invalid method.");
                }
                case 6 -> {
                    System.out.println("Logging out...");
                    return;
                }
                default -> System.out.println("Invalid action.");
            }
        }
    }
}
