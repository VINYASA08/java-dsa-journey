
package Bank_system;

public class Main {

    public static void main(String[] args) {

        SavingsAccount savings =
                new SavingsAccount(101, "Vinod", 5000);

        CurrentAccount current =
                new CurrentAccount(102, "Rahul", 5000);



        savings.displayAccountDetails();

        savings.deposit(2000);
        savings.withdraw(1000);

        System.out.println(
                "Annual interest: Rs. " +
                        savings.calculateInterest(1)
        );

        // Test sixth withdrawal with optional charge
        for (int i = 0; i < 5; i++) {
            savings.withdraw(100);
        }

        savings.withdraw(100, true);



        current.displayAccountDetails();

        current.withdraw(8000);
        current.deposit(2000);



        BankAccount[] accounts = {savings, current};

        for (BankAccount account : accounts) {
            account.withdraw(500);
            System.out.println(
                    "Balance: Rs. " + account.checkBalance()
            );
        }
    }
}
