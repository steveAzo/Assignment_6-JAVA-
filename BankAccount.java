abstract class BankAccount {
    public abstract long deposit();
    public abstract long withdrawal();
}

public class SavingsAccount extends BankAccount{

}

public class CheckingAccount extends BankAccount {
    //these are suggested attributes of this class from chat gpt, so implement them yourself
    private int accountNumber;
    private String accountHolderName;
    private double accountBalance;
    private boolean overdraftProtectionEnabled;
    private ArrayList<Transaction> transactionHistory;
}

public class Customer {
    //methods to display account balance
    //methods todeposit money
    //methods to withraw money
}

