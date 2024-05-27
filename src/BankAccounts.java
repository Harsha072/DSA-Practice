// TODO: Implement a class representing a savings account that implements the Account interface
public class BankAccounts extends Customer implements Account {


    BankAccounts(String name, String email, String password) {
        super(name, email, password);
    }


    @Override
    public void deposit(double amount) {
        //validate user

        if (amount > 0) { // Validate deposit amount
            getBalance().put(getName(), getBalance().getOrDefault(getName(), 0.0) + amount); // Add amount to balance
            System.out.println("Deposit successful.");
        } else {
            System.err.println("Invalid deposit amount.");
        }
    }

    @Override
    public double withdraw(double amount) {

        //validate user
        //first check the balance against the amount
        double curentBalance = getBalance().getOrDefault(getName(), 0.0);
        if (amount > 0) {
            if (amount <= curentBalance) {
                getBalance().put(getName(), curentBalance - amount);
                return amount;
            } else {
                System.err.println("insufficient balance");
            }
        } else {
            System.err.println("Invalid withdrawal amount.");
        }

        return 0.0;
    }

    @Override
    public double getCustomerBalance() {
        return getBalance().get(getName());
    }
}
