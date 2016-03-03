
/**
 * Account Class JBank.
 * 
 * @author (Fadziri.1306405231) 
 * @version (0.2)
 */
public class Account
{
  private char acctype;
  private double balance;
  private String id;
  
  
  public Account(){
      this.acctype = 'S';
      this.balance = 10.00;
  }
  public Account(char type, double amount){
      acctype = type;
      balance = amount;
  }
  public boolean deposit(double amount){
      if (amount >0)
      {
          balance = balance + amount;
          return true;
        }
      else {
          return false;
          
        }
  }
  public char getAccType(){
      return acctype;
  }
  public double getBalance(){
      return balance;
  }
  public String getId(){
      return id;
  }
  public void setbalance(double amount){
      balance = amount;
  }
  public void setID(String accId){
      id = accId;
  }
  public void setAcctType(char type){
      acctype = type;
  }
  public boolean withdraw(double amount){
    if (balance-amount > 0){
          balance = balance - amount;
          return true;
        }
    else {
        return false;
    }
  }
}
