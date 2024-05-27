package question1;

abstract class Account {
    private int accountNumber;
    private double balance;

    Account(int accountNumber, double balance, int interestRate){
        this.accountNumber=accountNumber;
        this.balance = balance;
    }
    abstract void  withdraw(double amt);
}

abstract class Savings extends Account{

    private double interestRate;

    Savings(int accountNumber, double balance, int interestRate){
        super(accountNumber,balance, interestRate);
        this.interestRate = interestRate;
    }

}
abstract class Current extends Account{

    private double overdraftLimit;

    Current(double overdraftLimit, int accountNumber, double balance, int interestRate ){
        super( accountNumber,balance,interestRate);
        this.overdraftLimit = overdraftLimit;
    }
}


