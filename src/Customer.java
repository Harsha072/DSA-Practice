import java.util.HashMap;

// Interface for a bank account
interface Account {
    // Declare a constant for the minimum balance
    double MIN_BALANCE = 1000.0;

    // Method to deposit funds into the account
    void deposit(double amount);

    // Method to withdraw funds from the account
    double withdraw(double amount);

    // Method to check the balance of the account
    double getCustomerBalance();
}

// Interface for a transaction
interface Transaction {
    // Method to process a transaction
    void process();
}

// Interface for a bank customer
interface CustomerInfo {
    // Method to display customer information
    void displayInfo();
}

public class Customer{
    private  String name ;
    private  String email;

    private String  password;
    private HashMap<String, Double> balance;





    Customer (String name, String email, String password){
        this.password = password;
        this.name = name;
        this.email = email;
        this.balance = new HashMap<String, Double>();

    }
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
    public HashMap<String, Double> getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        // Testing the classes
        BankAccounts b = new BankAccounts("harsha", "h@gmail.com","123");
        b.deposit(900);
        b.withdraw(200);
        System.out.print(b.getBalance());
    }

}

// TODO: Implement a class representing a transaction for transferring funds that implements the Transaction interface

// TODO: Implement a class representing a customer of the bank that implements the Customer interface
class CustomerDetails extends Customer implements CustomerInfo{
    CustomerDetails(String name, String email, String password) {
        super(name, email, password);
    }

    //validate customer
    @Override
    public void displayInfo() {
       System.out.println(" Customer info:"+getName()+" Balance: "+getBalance().get(getName()));
    }
}

