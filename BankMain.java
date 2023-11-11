public class BankMain {
    public static void main(String[] args) {
        // Example usage:

        // Creating instances of bank accounts
        SavingsAccount savingsAccount = new SavingsAccount("SA001", 1000, 0.02);
        CheckingAccount checkingAccount = new CheckingAccount("CA001", 500, 200);

        // Creating a customer and adding accounts
        Customer johnDoe = new Customer("John Doe");
        johnDoe.addAccount(savingsAccount);
        johnDoe.addAccount(checkingAccount);

        // Displaying initial balances
        johnDoe.displayBalances();

        // Depositing and withdrawing money
        johnDoe.deposit("SA001", 500);
        johnDoe.withdraw("CA001", 300);

        // Displaying updated balances
        johnDoe.displayBalances();
    }
}
