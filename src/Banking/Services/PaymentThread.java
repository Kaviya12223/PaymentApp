package Banking.Services;

import Banking.Model.Account;
import Banking.Payment.Payment;

public class PaymentThread extends Thread {
    private Payment method;
    private double amount;
    private Account account;

    public PaymentThread(Payment method, double amount, Account account) {
        this.method = method;
        this.amount = amount;
        this.account = account;
    }

    public void run() {
        method.pay(amount, account);
    }
}
