package abstractClass;

import java.util.Scanner;

public class App {



    public static void main(String[] args) {
        ATM atm = new ATM();

        SavingsAccount s = new SavingsAccount(100, 1349872, "Chris Kim", 1234, 50, 3);
        CheckingAccount c = new CheckingAccount(200, 123456, "Chris Kim", 1234);
        BusinessAccount b = new BusinessAccount(700, 1817571239, "Zip Code Wilmington", 1234, 12345678, 500);

        atm.addAccount(c);
        atm.addAccount(s);
        atm.addAccount(b);

        atm.login(1349872, 1234);

        System.out.println("Logged into " + c.getName() + "'s Checking account. Balance = " + c.getBalance());

        double newBalance = atm.withdraw(1349872, 25);

        System.out.println("Withdrew $25.00. New balance = " + newBalance);

        newBalance = atm.deposit(1349872, 234);

        System.out.println("Deposited $234.00. New balance = " + newBalance);

        atm.login(123456, 1234);

        System.out.println("Logged into " + s.getName() + "'s Savings account. Balance = " + s.getBalance());

        newBalance = atm.withdraw(1349872, 25);

        System.out.println("Withdrew $25.00. New balance = " + newBalance);

        newBalance = atm.deposit(1349872, 234);

        System.out.println("Deposited $234.00. New balance = " + newBalance);

        atm.login(1817571239, 1234);

        System.out.println("Logged into " + b.getName() + "'s Business account. Balance = " + b.getBalance());

        newBalance = atm.withdraw(1817571239, 25);

        System.out.println("Withdrew $25.00. New balance = " + newBalance);

        newBalance = atm.deposit(1817571239, 234);

        System.out.println("Deposited $234.00. New balance = " + newBalance);

    }

    public static Account enterAccountInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter starting balance: ");
        double balance = sc.nextDouble();
        System.out.println("Enter account name: ");
        String name = sc.next();
        System.out.println("Choose a PIN: ");
        int pin = sc.nextInt();
        System.out.println("Choose an account number: ");
        int acctNumber = sc.nextInt();
        System.out.println("Is this a checking account?");
        char isChecking = Character.toLowerCase(sc.next().charAt(0));
        if(isChecking == 'n'){
            System.out.println("Is this a savings account?");
            char isSavings = Character.toLowerCase(sc.next().charAt(0));
            if(isSavings == 'n'){
                System.out.println("Enter employer ID#: ");
                int employerID = sc.nextInt();
                System.out.println("Enter minimum balance: ");
                double minBalance = sc.nextDouble();
                return new BusinessAccount(balance, acctNumber, name, pin, employerID, minBalance);
            } else {
                System.out.println("Enter max allowable withdrawals per month: ");
                int maxWithdrawals = sc.nextInt();
                System.out.println("Enter minimum balance: ");
                double minBalance = sc.nextDouble();
                return new SavingsAccount(balance, acctNumber, name, pin, minBalance, maxWithdrawals);
            }
        } else return new CheckingAccount(balance, acctNumber, name, pin);
    }
}
