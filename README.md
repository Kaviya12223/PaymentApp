# Java CLI Banking Application

A simple command-line based banking application built in Java using OOP principles. 
Users can register, log in, deposit/withdraw funds, and make payments using different methods like UPI and Credit Card.
---

## 📁 Project Structure

![image](https://github.com/user-attachments/assets/1a14caff-3eb2-4e53-90a2-29c5de4edd69)

                        +---------------------+
                        |     <<interface>>   |
                        |     Payment         |
                        +---------------------+
                        | + pay(amt: double)  |
                        +---------------------+
                          ▲           ▲
                          |           |
          +----------------+     +-----------------+
          |   CreditCard    |     |       UPI       |
          +-----------------+     +-----------------+
          | + pay(double)   |     | + pay(double)   |
          +-----------------+     +-----------------+

                    +--------------------+
                    |      User          |
                    +--------------------+
                    | - username: String |
                    | - password: String |
                    | - account: Account|
                    +--------------------+

                    +--------------------------+
                    |         Account          |
                    +--------------------------+
                    | - accountNumber: String  |
                    | - balance: double        |
                    | - transactions: List<>   |
                    +--------------------------+
                    | + deposit(double)        |
                    | + withdraw(double)       |
                    | + addTransaction(tx)     |
                    +--------------------------+

                    +-------------------------------+
                    |         Transaction           |
                    +-------------------------------+
                    | - amount: double              |
                    | - type: String (credit/debit) |
                    | - mode: String (UPI/Card)     |
                    +-------------------------------+

                    +-----------------------------+
                    |          Bank               |
                    +-----------------------------+
                    | + registerUser()            |
                    | + loginUser()               |
                    | + processPayment()          |
                    +-----------------------------+

                    +-----------------------------+
                    |      PaymentThread          |
                    +-----------------------------+
                    | - method: Payment           |
                    | - amount: double            |
                    | + run()                     |
                    +-----------------------------+

                    +-----------------------------+
                    |         PaymentApp          |
                    +-----------------------------+
                    | + main(String[] args)       |
                    +-----------------------------+


---

## ✨ Features

- 🔐 User Registration & Login
- 💰 Deposit & Withdraw Money
- 🧾 View Recent Transactions
- 💳 Make Payments via:
  - UPI
  - Credit Card
- 🧵 Payment processing using multithreading

---

## 🧠 Concepts Used

- Object-Oriented Programming
- Interface & Abstraction
- Inheritance & Polymorphism
- Multithreading
- Java Collections (`List`, `ArrayList`)
- Clean package organization

---

Run the PaymentApp class inside Banking.App

📷 Sample CLI Output
Welcome to CLI Banking!
1. Register
2. Login
Enter choice: 1
Enter username: john
Enter password: ****
User registered successfully!

-- After login --
1. View Balance
2. Deposit
3. Withdraw
4. Make Payment
5. View Transactions

  author:
    name: Kaviya G
    profile: [https://www.linkedin.com/](https://www.linkedin.com/in/kaviya7812/)
