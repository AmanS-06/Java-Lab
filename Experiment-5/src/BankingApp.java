import java.util.ArrayList;

public class BankingApp {

    public static void main(String[] args) {

        // Create Customers
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer(1, "Rahul Sharma", "rahul@email.com", "9876543210"));
        customers.add(new Customer(2, "Ankit Verma",  "ankit@email.com", "9123456780"));
        customers.add(new Customer(3, "Priya Iyer",   "priya@email.com", "9988776655"));
        customers.add(new Customer(4, "Sneha Patil",  "sneha@email.com", "9001234567"));

        // Create Accounts 
        ArrayList<Account> accounts = new ArrayList<>();

        // Savings Account -> displays "Interest Calculated Successfully"
        accounts.add(new SavingsAccount("Rahul Sharma", 15000));

        // Current Account -> displays "Minimum Balance Maintained"
        accounts.add(new CurrentAccount("Ankit Verma", 25000));

        // Another Savings
        accounts.add(new SavingsAccount("Priya Iyer", 8000));

        // Loan Account
        accounts.add(new LoanAccount("Sneha Patil", 300000, 0.08, 60));

        // Transactions 
        accounts.get(0).deposit(2000);                   // Rahul deposits
        accounts.get(1).withdraw(5000);                  // Ankit withdraws (stays above min)
        accounts.get(2).withdraw(500);                   // Priya withdraws
        ((LoanAccount) accounts.get(3)).deposit(10000);  // Sneha repays loan

        // Consolidated Display 
        for (Account acc : accounts) {
            System.out.println();
            acc.display();
        }
    }
}