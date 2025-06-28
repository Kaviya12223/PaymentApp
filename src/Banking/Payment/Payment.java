package Banking.Payment;
import Banking.Model.Account;
public interface Payment {
    void pay(double amt, Account acc);
}
