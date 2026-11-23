
package Bank_system;

public class BankAccount {

    private int acc_number;
    private String acc_holder_name;
    private double balance;

    public BankAccount(int acc_number, String acc_holder_name,
                       double balance) {

        if (acc_number <= 0 || acc_holder_name == null
                || acc_holder_name.isBlank() || balance < 0) {
            throw new IllegalArgumentException("Invalid account details");
        }

        this.acc_number = acc_number;
        this.acc_holder_name = acc_holder_name;
        this.balance = balance;
    }


    public int getAccNumber() {
        return acc_number;
    }

    public String getAccHolderName() {
        return acc_holder_name;
    }

    public double getBalance() {
        return balance;
    }

    public double checkBalance() {
        return balance;
    }


    protected final void updateBalance(double newBalance) {
        this.balance = newBalance;
    }

    protected final boolean isValidAmount(double amount) {
        return Double.isFinite(amount) && amount > 0;
    }



    public boolean deposit(double amount) {

        if (!isValidAmount(amount)) {
            System.out.println("Invalid deposit amount");
            return false;
        }

        updateBalance(balance + amount);

        System.out.println("Deposited: Rs. " + amount);
        return true;
    }



    public boolean withdraw(double amount) {

        if (!isValidAmount(amount)) {
            System.out.println("Invalid withdrawal amount");
            return false;
        }

        if (amount > balance) {
            System.out.println("Insufficient balance");
            return false;
        }

        updateBalance(balance - amount);

        System.out.println("Withdrawn: Rs. " + amount);
        return true;
    }

    public void displayAccountDetails() {

        System.out.println("Account Number: " + acc_number);
        System.out.println("Account Holder: " + acc_holder_name);
        System.out.println("Balance: Rs. " + balance);
    }
}
