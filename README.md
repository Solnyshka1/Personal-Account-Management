1.Personal Account Management System

This is a simple **Personal Account Management** system implemented in Java. It allows you to create a personal account, deposit and withdraw money, and view the transaction history. The system utilizes object-oriented programming principles and features an enum for transaction types, along with a custom `Amount` class for managing transactions.

2.Features

- TransactionType Enum: Defines the types of transactions (DEPOSIT and WITHDRAWAL).
- Amount Class: Represents a transaction amount and type.
- PersonalAccount Class: Manages the account's transactions and balance.
- Deposit and withdraw money.
- View transaction history.
- Retrieve current account balance and account details.
  
3.Classes Overview

TransactionType Enum

The `TransactionType` enum includes:
- `DEPOSIT`: Represents a deposit transaction.
- `WITHDRAWAL`: Represents a withdrawal transaction.

4.Amount Class

This class represents a transaction amount and transaction type.
- Attributes:
  - `amount` (double): The amount involved in the transaction.
  - `transactionType` (TransactionType): The type of transaction (DEPOSIT or WITHDRAWAL).
- Methods:
  - `getAmount()`: Returns the transaction amount.
  - `getTransactionType()`: Returns the type of the transaction.
  - `toString()`: Provides a readable representation of the transaction.

5.PersonalAccount Class

This class manages an account and maintains the transaction history.
- Attributes:
  - `accountNumber` (int): A unique identifier for the account.
  - `accountHolder` (String): The name of the account holder.
  - `balance` (double): The current balance in the account.
  - `transactions` (ArrayList<Amount>): Stores a list of all transactions.
  
6.Methods:
  - `deposit(double amount)`: Deposits a specified amount into the account.
  - `withdraw(double amount)`: Withdraws a specified amount from the account if sufficient balance is available.
  - `printTransactionHistory()`: Prints all transactions related to the account.
  - `getBalance()`: Returns the current balance of the account.
  - `getAccountNumber()`: Returns the account number.
  - `getAccountHolder()`: Returns the account holder's name.

7.Usage

Here's a basic example of how to use the `PersonalAccount` class:

java
public class Main {
    public static void main(String[] args) {
        PersonalAccount account = new PersonalAccount(78945, "Saadat Nurbekova");

        account.deposit(500.0);
        account.withdraw(200.0);
        account.deposit(100.0);

        System.out.println("Current balance: $" + account.getBalance());
        account.printTransactionHistory();
    }
}
