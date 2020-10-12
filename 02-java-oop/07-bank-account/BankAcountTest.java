
public class BankAcountTest {
    public static void main(String[] args) {
        BankAcount accountchecking = new BankAcount();
        BankAcount accountchecking2 = new BankAcount();
        accountchecking.deposit(500.00,100.00);
       int acountscreated = BankAcount.numberofAcounts;
       System.out.println("Total Account Created " + acountscreated);
       accountchecking.withdraw(200.00);
       double acc1 = accountchecking.getCheckingBalance();
       System.out.println("Your checking balance after withdraw is: " + acc1);
       accountchecking.totalMoney();
       double total = BankAcount.totalAmount;
       System.out.println(total);
    }
}
