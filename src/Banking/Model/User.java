package Banking.Model;

public class User {
    private String username;
    private String password;
    private Account account;

    public User(String username, String password, Account account) {
        this.username = username;
        this.password = password;
        this.account = account;
    }

    public boolean authenticate(String inputPassword) {
        return this.password.equals(inputPassword);
    }

    public String getUsername() {
        return username;
    }

    public Account getAccount() {
        return account;
    }
}
