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
