package abstractClass;

public class CheckingAccount extends Account{

    public CheckingAccount(double balance, int accountNumber, String name, int pinNumber) {
        super(balance, 0.05, accountNumber, name, pinNumber);
    }

    public double withdraw(double amount){
        if(amount < getBalance()){
            setBalance(getBalance() - amount);
        } else {
            System.out.println("Insufficient funds. Balance = " + getBalance());
        }
        return getBalance();
    }
}
