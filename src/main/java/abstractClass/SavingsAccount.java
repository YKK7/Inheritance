package abstractClass;

public class SavingsAccount extends Account{

    private double minBalance;
    private int maxWithdrawals;
    private int withdrawalsThisMonth;

    public SavingsAccount(double balance, int accountNumber, String name, int pinNumber, double minBalance, int maxWithdrawals) {
        super(balance, 1.25, accountNumber, name, pinNumber);
        this.minBalance = minBalance;
        this.maxWithdrawals = maxWithdrawals;
    }

    public double withdraw(double amount){
        if(amount > getBalance() - minBalance){
            System.out.println("Insufficient funds. Balance = " + getBalance());
        } else if(withdrawalsThisMonth >= maxWithdrawals)
            System.out.println("Maximum number of withdrawals reached (" + withdrawalsThisMonth + ")");
        else {
            setBalance(getBalance() - amount);
            withdrawalsThisMonth++;
        }
        return getBalance();
    }
}
