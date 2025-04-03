// Encapsulation Example in Java
class BankAccount {
    // Private data members (Encapsulation)
    private String accountHolder;
    private double balance;

    // Constructor
    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Getter method for accountHolder
    public String getAccountHolder() {
        return accountHolder;
    }

    // Setter method for accountHolder
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    // Getter method for balance
    public double getBalance() {
        return balance;
    }

    // Setter method for balance (Ensuring only positive deposits)
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw method (Ensuring no overdrafts)
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        // Creating an object of BankAccount
        BankAccount account = new BankAccount("Harshit Kumar", 5000);

        // Accessing private data using public methods.
        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Initial Balance: " + account.getBalance());

        // Updating balance safely
        account.deposit(10000);
        account.withdraw(5000);

    }
}
