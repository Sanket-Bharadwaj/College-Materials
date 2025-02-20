package Q08;

public class CurrentAccount extends Account {
    private double overdraftLimit;

    // Constructor
    public CurrentAccount(String accountNumber, double initialBalance, double overdraftLimit) {
        super(accountNumber, initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    // Overridden deposit method
    @Override
    public void deposit(double amount) {
        System.out.println("Depositing: " + amount);
        updateBalance(amount); // Update balance
    }

    // Overridden withdraw method to check overdraft limit
    @Override
    public void withdraw(double amount) {
        if (getBalance() + overdraftLimit >= amount) {
            System.out.println("Withdrawing: " + amount);
            updateBalance(-amount); // Update balance
        } else {
            System.out.println("Withdrawal exceeds overdraft limit.");
        }
    }
}