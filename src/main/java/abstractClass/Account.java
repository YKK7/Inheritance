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

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }

    public double deposit(double amount){
        balance += amount;
        return balance;
    }

    public abstract double withdraw(double amount);


}
