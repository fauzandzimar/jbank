
/**
 * Customer Class JBank.
 * 
 * @author (Fadziri.1306405231) 
 * @version (0.2)
 */
public class Customer
{
    // instance variables - replace the example below with your own
    private Account accounts = new Account();
    private String cityname;
    private int custid;
    private String dateOfBirth;
    private String email;
    private String firstname;
    private String lastname;
    private int numberofcurrentaccounts;
    private String streetaddress;
    private String phonenumber;
    private String ziporpostalcode;
    /**
     * Constructor for objects of class Customer
     */
    public Customer()
    {
        // initialise instance variables
    }
    public Customer(String fname, String lname, String dob){
        
    }
    public Customer(String firstName, String lastName, String dateOfBirth, int custId){
    
    }
    private String getAdress(){
        return streetaddress +","+ cityname +","+ ziporpostalcode;
      
    }
    public Account getAccount(){
        return accounts;
    }
    private int getCustomerId(){
        return custid;
    }
    private String getEmail(){
        return email;
    }
    public String getName(){
        return lastname +","+ firstname;
    }
    public int getNumOfAccounts(){
        return numberofcurrentaccounts;
    }
    private String getPhoneNumber(){
        return phonenumber;
    }
    private void setAdress(String street, String city, String code){
        streetaddress = street;
        cityname = city;
        ziporpostalcode = code;
        return;
    }
    private void setEmail(String emailAddress){
        email = emailAddress;
    }
    public void setName(String lname, String fname){
        lastname = lname;
        firstname = fname;
    }
    private void setPhoneNumber(String phonenum){
        phonenumber = phonenum;
    }
    public void setaccount (Account accounts){
        this.accounts = accounts;
    }
}