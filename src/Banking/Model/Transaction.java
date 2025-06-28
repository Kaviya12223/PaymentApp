package Banking.Model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transaction {
    private double amount;
    private String type;
    private String mode;
    private String date;

    public Transaction(double amount, String type, String mode) {
        this.amount = amount;
        this.type = type;
        this.mode = mode;
        this.date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
    }

    @Override
    public String toString() {
        return "[" + date + "] ₹" + amount + " | " + type + " | via " + mode;
    }
}
