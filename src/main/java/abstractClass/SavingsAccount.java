package abstractClass;

public class SavingsAccount extends Account{

    private double minBalance;
    private int maxWithdrawals;

    public SavingsAccount(double balance, double interestRate, int accountNumber, String name, int pinNumber, double minBalance, int maxWithdrawals) {
        super(balance, interestRate, accountNumber, name, pinNumber);
        this.minBalance = minBalance;
        this.maxWithdrawals = maxWithdrawals;
    }

    public double withdraw(double amount){
        return 0;
    }
}
