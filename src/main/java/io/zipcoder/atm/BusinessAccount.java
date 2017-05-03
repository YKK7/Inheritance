package io.zipcoder.atm;

public class BusinessAccount extends Account{

    private int employerID;
    private double minBalance;

    public BusinessAccount(double balance, int accountNumber, String name, int pinNumber, int employerID, double minBalance) {
        super(balance, 0.5, accountNumber, name, pinNumber);
        this.employerID = employerID;
        this.minBalance = minBalance;
    }

    public double withdraw(double amount){
        if(amount > getBalance() - minBalance)
            System.out.println("Insufficient funds. Balance = " + getBalance());
        else setBalance(getBalance() - amount);
        return getBalance();
    }
}
