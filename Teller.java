/**
 * Teller Class JBank.
 * 
 * @author (Fadziri.1306405231) 
 * @version (0.2)
 */
public class Teller
{
    /**
     * Constructor for objects of class Teller
     */
    public Teller()
    {
       
    }

    public static void main(String args[]){
        Customer c1 = new Customer(),cus;
        Account a1 = new Account(), acc;
        c1.setName("Sanadhi","Sutandi");
        a1.setbalance(1999999);
        c1.setaccount(a1);
        acc = c1.getAccount();
        System.out.println(c1.getName());
        System.out.println(acc.getBalance());
    }

    






}
