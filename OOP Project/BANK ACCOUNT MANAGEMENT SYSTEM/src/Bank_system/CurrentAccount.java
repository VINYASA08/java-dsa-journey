
package Bank_system;

public class CurrentAccount extends BankAccount {

    private static final double OVERDRAFT_LIMIT = 10000;

    public CurrentAccount(int acc_number, String name, double balance) {
        super(acc_number, name, balance);
    }

    @Override
    public boolean withdraw(double amount) {

        if (!isValidAmount(amount)) {
            System.out.println("Invalid withdrawal amount");
            return false;
        }

        double newBalance = getBalance() - amount;

        if (newBalance < -OVERDRAFT_LIMIT) {
            System.out.println("Overdraft limit exceeded");
            return false;
        }

        updateBalance(newBalance);

        System.out.println("Withdrawal successful: Rs. " + amount);
        System.out.println("Remaining balance: Rs. " + getBalance());

        return true;
    }

}
