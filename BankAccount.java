import java.util.ArrayList;
import java.util.List;


abstract class BankAccount {
    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    public void addInterest() {
        balance += balance * interestRate;
    }
}

class CheckingAccount extends BankAccount {
    private double overdraftLimit;

    public CheckingAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds!");
        }
    }
}

class Customer {
    private String name;
    private List<BankAccount> accounts;

    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    public void displayBalances() {
        System.out.println("Account balances for " + name + ":");
        for (BankAccount account : accounts) {
            System.out.println("Account " + account.accountNumber + ": $" + account.balance);
        }
    }

    public void deposit(String accountNumber, double amount) {
        for (BankAccount account : accounts) {
            if (account.accountNumber.equals(accountNumber)) {
                account.deposit(amount);
                System.out.println("Deposited $" + amount + " into account " + accountNumber);
                return;
            }
        }
        System.out.println("Account " + accountNumber + " not found.");
    }

    public void withdraw(String accountNumber, double amount) {
        for (BankAccount account : accounts) {
            if (account.accountNumber.equals(accountNumber)) {
                account.withdraw(amount);
                System.out.println("Withdrew $" + amount + " from account " + accountNumber);
                return;
            }
        }
        System.out.println("Account " + accountNumber + " not found.");
    }
}

