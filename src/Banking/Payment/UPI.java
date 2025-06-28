package Banking.Payment;

import Banking.Model.Account;
import Banking.Model.Transaction;

public class UPI implements Payment {
    public void pay(double amt, Account account) {
        if (account.withdraw(amt)) {
            System.out.println("Paid ₹" + amt + " using UPI.");
            account.addTransaction(new Transaction(amt, "debit", "UPI"));
        }
    }
}
