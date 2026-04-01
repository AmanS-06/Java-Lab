public class CurrentAccount extends Account {
    private static final double MIN_BALANCE = 5000.0;

    public CurrentAccount(String accountHolderName, double initialDeposit) {
        super(accountHolderName, "Current Account", initialDeposit);
    }

    // Override withdraw 
    @Override
    public void withdraw(double amount) {
        if ((getBalance() - amount) < MIN_BALANCE) {
            System.out.println("Minimum Balance Not Maintained.");
            return;
        }
        super.withdraw(amount);
    }

    // Override display 

    @Override
    public void display() {
        super.display();
        if (getBalance() >= MIN_BALANCE) {
            System.out.println("Minimum Balance Maintained");
        } else {
            System.out.println("Minimum Balance Not Maintained.");
        }
    }
}