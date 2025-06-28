package Banking.Services;

import Banking.Model.Account;
import Banking.Model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Bank {
    private List<User> users = new ArrayList<>();

    public boolean registerUser(String username, String password) {
        if (findUser(username) != null) {
            System.out.println("Username already exists.");
            return false;
        }
        String accNo = UUID.randomUUID().toString().substring(0, 8);
        Account account = new Account(accNo);
        users.add(new User(username, password, account));
        System.out.println("Registration successful. Account No: " + accNo);
        return true;
    }

    public User loginUser(String username, String password) {
        User user = findUser(username);
        if (user != null && user.authenticate(password)) {
            System.out.println("Login successful.");
            return user;
        }
        System.out.println("Invalid credentials.");
        return null;
    }

    public User findUser(String username) {
        for (User u : users) {
            if (u.getUsername().equalsIgnoreCase(username)) return u;
        }
        return null;
    }
}
