package Q08;

public class SavingsAccount extends Account {
    private double interestRate;

    // Constructor
    public SavingsAccount(String accountNumber, double initialBalance, double interestRate) {
        super(accountNumber, initialBalance);
        this.interestRate = interestRate;
    }

    // Overridden deposit method to calculate interest
    @Override
    public void deposit(double amount) {
        double interest = (getBalance() + amount) * (interestRate / 100);
        double newBalance = getBalance() + amount + interest;
        System.out.println("Depositing: " + amount + " with interest: " + interest);
        updateBalance(newBalance - getBalance()); // Update balance
    }

    // Overridden withdraw method to ensure sufficient balance
    @Override
    public void withdraw(double amount) {
        if (getBalance() >= amount) {
            System.out.println("Withdrawing: " + amount);
            updateBalance(-amount); // Update balance
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }
    }
}