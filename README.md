# Java CLI Banking Application

A simple command-line based banking application built in Java using OOP principles. 
Users can register, log in, deposit/withdraw funds, and make payments using different methods like UPI and Credit Card.
---

## 📁 Project Structure

📁 PaymentApp/
├── 📂 src/
│   └── 📂 Banking/
│       ├── 📂 App/                    # Main app logic and CLI
│       │   └── 📄 PaymentApp.java
│       ├── 📂 Model/                  # Core models
│       │   ├── 📄 User.java
│       │   ├── 📄 Account.java
│       │   └── 📄 Transaction.java
│       ├── 📂 Payment/               # Payment interface & implementations
│       │   ├── 📄 Payment.java
│       │   ├── 📄 UPI.java
│       │   └── 📄 CreditCard.java
│       └── 📂 Services/              # Bank ops & threading
│           ├── 📄 Bank.java
│           └── 📄 PaymentThread.java
├── 📄 .gitignore
└── 📄 README.md


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
