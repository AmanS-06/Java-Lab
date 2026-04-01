public class Account {
    private static int nextAccNo = 1001;

    private int    accountNo;
    private String accountHolderName;
    private String accountType;
    private double balance;

    public Account(String accountHolderName, String accountType, double balance) {
        this.accountNo          = nextAccNo++;
        this.accountHolderName  = accountHolderName;
        this.accountType        = accountType;
        this.balance            = balance;
    }

    // Core operations

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount.");
            return;
        }
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
            return;
        }
        if (amount > balance) {
            System.out.println("Insufficient Balance.");
            return;
        }
        balance -= amount;
    }

    // Display

    public void display() {
        System.out.println("Account Number: " + accountNo);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Type: "   + accountType);
        System.out.println("Balance: "         + (int) balance);
    }

    // Getters / setters

    public int    getAccountNo() { 
        return accountNo; 
    }
    public String getAccountHolderName() { 
        return accountHolderName; 
    }
    public String getAccountType() {
        return accountType; 
    }
    public double getBalance() {
        return balance; 
    }
    protected void setBalance(double b) {
        this.balance = b; 
    }
}