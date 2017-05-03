package abstractClass;

public class CheckingAccount extends Account{

    public CheckingAccount(double balance, double interestRate, int accountNumber, String name, int pinNumber) {
        super(balance, interestRate, accountNumber, name, pinNumber);
    }

    public double withdraw(double amount){

    }
}
