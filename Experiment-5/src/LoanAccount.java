public class LoanAccount extends Account {
    private double  loanAmount;
    private double  interestRate;
    private int     tenureMonths;

    public LoanAccount(String accountHolderName, double loanAmount,
                       double interestRate, int tenureMonths) {
        super(accountHolderName, "Loan Account", -loanAmount);
        this.loanAmount   = loanAmount;
        this.interestRate = interestRate;
        this.tenureMonths = tenureMonths;
    }

    // Override deposit
    @Override
    public void deposit(double amount) {
        if (amount <= 0) { System.out.println("Invalid amount."); return; }
        double outstanding = -getBalance();
        if (outstanding <= 0) { System.out.println("Loan fully repaid."); return; }
        double paid = Math.min(amount, outstanding);
        setBalance(getBalance() + paid);
        System.out.println("Loan Repayment Successful. Outstanding: " + (int)(-getBalance()));
    }

    // Override withdraw
    @Override
    public void withdraw(double amount) {
        System.out.println("Withdrawals not permitted on a Loan Account.");
    }

    // EMI calculation
    public double calculateEMI() {
        double r = interestRate / 12.0;
        return loanAmount * r * Math.pow(1 + r, tenureMonths)
               / (Math.pow(1 + r, tenureMonths) - 1);
    }

    // Override display
    @Override
    public void display() {
        super.display();
        System.out.printf("EMI: %.2f%n", calculateEMI());
    }
}