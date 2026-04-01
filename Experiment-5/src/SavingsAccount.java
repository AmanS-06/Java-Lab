public class SavingsAccount extends Account {
    private static final double INTEREST_RATE = 0.04;   // 4% per annum
    private static final double MIN_BALANCE   = 500.0;

    public SavingsAccount(String accountHolderName, double initialDeposit) {
        super(accountHolderName, "Savings Account", initialDeposit);
    }

    // Override deposit 

    @Override
    public void deposit(double amount) {
        super.deposit(amount);
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

    // Apply interest and display status

    public void calculateInterest() {
        double interest = getBalance() * INTEREST_RATE;
        setBalance(getBalance() + interest);
        System.out.println("Interest Calculated Successfully");
    }

    // Check and print minimum balance status 

    public void checkMinimumBalance() {
        if (getBalance() >= MIN_BALANCE) {
            System.out.println("Minimum Balance Maintained");
        } else {
            System.out.println("Minimum Balance Not Maintained.");
        }
    }

    // Override display 

    @Override
    public void display() {
        super.display();
        calculateInterest();   // prints "Interest Calculated Successfully"
    }
}