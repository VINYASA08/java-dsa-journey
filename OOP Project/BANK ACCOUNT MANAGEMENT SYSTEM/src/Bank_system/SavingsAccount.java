
package Bank_system;

public class SavingsAccount extends BankAccount {

    private static final double MIN_BALANCE = 1000;
    private static final double ANNUAL_INTEREST_RATE = 0.04;
    private static final double WITHDRAWAL_CHARGE = 0.004;
    private static final int FREE_WITHDRAWALS = 5;

    private int withdrawalCount = 0;

    public SavingsAccount(int acc_number, String name, double balance) {
        super(acc_number, name, balance);

        if (balance < MIN_BALANCE) {
            throw new IllegalArgumentException(
                    "Savings account requires minimum Rs. 1000"
            );
        }
    }


    public double calculateInterest(int years) {

        if (years <= 0) {
            System.out.println("Invalid number of years");
            return 0;
        }

        return getBalance() * ANNUAL_INTEREST_RATE * years;
    }

    public double getBalanceWithInterest(int years) {
        return getBalance() + calculateInterest(years);
    }



    @Override
    public boolean withdraw(double amount) {

        return withdraw(amount, false);
    }


    public boolean withdraw(double amount, boolean acceptCharge) {

        if (!isValidAmount(amount)) {
            System.out.println("Invalid withdrawal amount");
            return false;
        }

        double charge = 0;

        if (withdrawalCount >= FREE_WITHDRAWALS) {

            if (!acceptCharge) {
                System.out.println("Free withdrawal limit reached.");
                System.out.println(
                        "Accept 0.4% transaction charge to continue."
                );
                return false;
            }

            charge = amount * WITHDRAWAL_CHARGE;
        }

        double totalDeduction = amount + charge;
        double remainingBalance = getBalance() - totalDeduction;

        if (remainingBalance < MIN_BALANCE) {
            System.out.println("Minimum balance of Rs. 1000 required");
            return false;
        }

        updateBalance(remainingBalance);
        withdrawalCount++;

        System.out.println("Withdrawn: Rs. " + amount);
        System.out.println("Transaction charge: Rs. " + charge);
        System.out.println("Remaining balance: Rs. " + getBalance());

        return true;
    }

}
