package Q08;

public class BankingApp {
    public static void main(String[] args) {
        // Create SavingsAccount and CurrentAccount objects
        SavingsAccount savingsAccount = new SavingsAccount("SA123", 1000.0, 5.0);
        CurrentAccount currentAccount = new CurrentAccount("CA456", 500.0, 200.0);

        // Perform transactions on SavingsAccount
        savingsAccount.displayAccountDetails();
        savingsAccount.deposit(200);
        savingsAccount.withdraw(100);
        savingsAccount.withdraw(1200); // Should show insufficient balance
        savingsAccount.displayAccountDetails();

        // Perform transactions on CurrentAccount
        currentAccount.displayAccountDetails();
        currentAccount.deposit(300);
        currentAccount.withdraw(600);
        currentAccount.withdraw(200); // Should show withdrawal exceeds overdraft limit
        currentAccount.displayAccountDetails();
    }
}