
public class BankAcount{
  public String accountNumber;
  private double checkingBalance;
  private double savingBalance;
  public static int numberofAcounts = 0;
  public static double totalAmount = 0;

  public BankAcount(){
    randomAcountNumber();
    numberofAcounts++;

  }
  private String randomAcountNumber(){
    Long Number = (long) Math.floor(Math.random()* 9_000_000_000L) + 1_000_000_000L;
        accountNumber = Long.toString(Number);
    System.out.println("Account number " +accountNumber + " has been created");
    return accountNumber;
  }

  public double getCheckingBalance() {
      return checkingBalance;
  }

  public double getSavingBalance() {
      return savingBalance;
  }

  public void deposit(double ch, double saving){
    this.checkingBalance =  this.checkingBalance+ch;
    System.out.println("Deposited money to checking is: " +this.checkingBalance);
    this.savingBalance =  this.savingBalance+saving;
    System.out.println("Deposited money to saving is: " + this.savingBalance );

  }


  public void withdraw(double checking){
      if(this.checkingBalance-checking < 0){
          System.out.println("your balance is not suffiecient please deposit money");
      }else{
        this.checkingBalance = this.checkingBalance-checking;
        System.out.println("You withdrew " + checking + " amount from your checking checking");
      }

  }
  public void totalMoney(){
      double totalmoney = this.savingBalance + this.checkingBalance;
      System.out.println("Total money in your checking and saving account is: " + totalmoney);

  }


}