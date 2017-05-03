package abstractClass;

public abstract class Account {

    private double balance;
    private double interestRate;
    private final int accountNumber;
    private String name;
    private int pinNumber;

    public Account(double balance, double interestRate, int accountNumber, String name, int pinNumber) {
        this.balance = balance;
        this.interestRate = interestRate;
        this.accountNumber = accountNumber;
        this.name = name;
        this.pinNumber = pinNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double amount){
        balance = amount;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public double deposit(double amount){
        balance += amount;
        return balance;
    }

    public abstract double withdraw(double amount);


}
