import java.util.ArrayList;

public class PersonalAccount {
    private final int accountNumber;
    private String accountHolder;
    private double balance;
    private ArrayList<Amount> transactions;

    public PersonalAccount(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
        this.transactions = new ArrayList<>();
    }

    public void deposit(double amount) {
        if (amount > 0) {
            Amount deposit = new Amount(amount, TransactionType.DEPOSIT);
            transactions.add(deposit);
            balance += amount;
            System.out.println("Deposit of: $" + amount + ". Current balance: $" + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            Amount withdrawal = new Amount(amount, TransactionType.WITHDRAWAL);
            transactions.add(withdrawal);
            balance -= amount;
            System.out.println("Withdrawal of: $" + amount + ". Current balance: $" + balance);
        } else if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else {
            System.out.println("Insufficient funds for the withdrawal.");
        }
    }

    public void printTransactionHistory() {
        System.out.println("Transaction history for account " + accountNumber + ":");
        if (transactions.isEmpty()) {
            System.out.println("No transactions available.");
        } else {
            for (Amount transaction : transactions) {
                System.out.println(transaction);
            }
        }
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }
}
