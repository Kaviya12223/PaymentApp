package Banking.Model;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private String accountNumber;
    private double balance;
    private List<Transaction> transactions;

    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
        this.transactions = new ArrayList<>();
    }

    public boolean withdraw(double amt) {
        if (amt > balance) {
            System.out.println("Insufficient balance.");
            return false;
        }
        balance -= amt;
        return true;
    }

    public void deposit(double amt) {
        balance += amt;
        System.out.println("₹" + amt + " deposited.");
        addTransaction(new Transaction(amt, "credit", "Deposit"));
    }

    public void addTransaction(Transaction tx) {
        transactions.add(tx);
    }

    public double getBalance() {
        return balance;
    }

    public List<Transaction> getRecentTransactions() {
        int size = transactions.size();
        return transactions.subList(Math.max(0, size - 5), size);
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}
