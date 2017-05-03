package abstractClass;

public class BusinessAccount extends Account{

    private int employerID;
    private double minBalance;

    public BusinessAccount(double balance, double interestRate, int accountNumber, String name, int pinNumber, int employerID, double minBalance) {
        super(balance, interestRate, accountNumber, name, pinNumber);
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
