package abstractClass;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ATMTest {

    @Test
    public void addAccountTest(){

        //: Given
        CheckingAccount c = new CheckingAccount(100, 123456, "Chris Kim", 1234);
        SavingsAccount s = new SavingsAccount(100, 123456, "Chris Kim", 1234, 50, 3);
        BusinessAccount b = new BusinessAccount(700, 123456, "Zip Code Wilmington", 1234, 12345678, 500);

        ATM atm = new ATM();

        //: When
        atm.addAccount(c);
        atm.addAccount(s);
        atm.addAccount(b);

        //: Then
        assertEquals("There should be 3 accounts", 3, atm.getAccountsList().size());
    }

    @Test
    public void closeAccountTest(){

        //: Given
        SavingsAccount s = new SavingsAccount(100, 1349872, "Chris Kim", 1234, 50, 3);
        CheckingAccount c = new CheckingAccount(100, 123456, "Chris Kim", 1234);
        BusinessAccount b = new BusinessAccount(700, 1817571239, "Zip Code Wilmington", 1234, 12345678, 500);

        ATM atm = new ATM();

        //: When
        atm.addAccount(c);
        atm.addAccount(s);
        atm.addAccount(b);
        atm.closeAccount(1817571239);

        //: Then
        assertEquals("There should be 2 accounts", 2, atm.getAccountsList().size());
    }

    @Test
    public void loginTest(){

        //: Given
        SavingsAccount s = new SavingsAccount(100, 1349872, "Chris Kim", 1234, 50, 3);
        CheckingAccount c = new CheckingAccount(100, 123456, "Chris Kim", 1234);
        BusinessAccount b = new BusinessAccount(700, 1817571239, "Zip Code Wilmington", 1234, 12345678, 500);

        ATM atm = new ATM();

        atm.addAccount(c);
        atm.addAccount(s);
        atm.addAccount(b);

        //: When
        boolean result = atm.login(123456, 1234);

        //: Then
        assertEquals("verified should be set to true", true, atm.isVerified());
    }

    @Test
    public void SavingsWithdrawalTest(){

        //: Given
        SavingsAccount s = new SavingsAccount(100, 1349872, "Chris Kim", 1234, 50, 3);
        CheckingAccount c = new CheckingAccount(100, 123456, "Chris Kim", 1234);
        BusinessAccount b = new BusinessAccount(700, 1817571239, "Zip Code Wilmington", 1234, 12345678, 500);

        ATM atm = new ATM();

        //: When
        double result = atm.withdraw(1349872, 25);

        //: Then
        assertEquals("New balance should equal 75", 75, result, 0);
    }

    @Test
    public void CheckingWithdrawalTest(){

        //: Given
        SavingsAccount s = new SavingsAccount(100, 1349872, "Chris Kim", 1234, 50, 3);
        CheckingAccount c = new CheckingAccount(100, 123456, "Chris Kim", 1234);
        BusinessAccount b = new BusinessAccount(700, 1817571239, "Zip Code Wilmington", 1234, 12345678, 500);

        ATM atm = new ATM();

        //: When
        double result = atm.withdraw(123456, 25);

        //: Then
        assertEquals("New balance should equal 75", 75, result, 0);
    }

    @Test
    public void BusinessWithdrawalTest(){

        //: Given
        SavingsAccount s = new SavingsAccount(100, 1349872, "Chris Kim", 1234, 50, 3);
        CheckingAccount c = new CheckingAccount(100, 123456, "Chris Kim", 1234);
        BusinessAccount b = new BusinessAccount(700, 1817571239, "Zip Code Wilmington", 1234, 12345678, 500);

        ATM atm = new ATM();

        //: When
        double result = atm.withdraw(1817571239, 100);

        //: Then
        assertEquals("New balance should equal 600", 600, result, 0);
    }

    @Test
    public void SavingsDepositTest(){

        //: Given
        SavingsAccount s = new SavingsAccount(100, 1349872, "Chris Kim", 1234, 50, 3);
        CheckingAccount c = new CheckingAccount(100, 123456, "Chris Kim", 1234);
        BusinessAccount b = new BusinessAccount(700, 1817571239, "Zip Code Wilmington", 1234, 12345678, 500);

        ATM atm = new ATM();

        //: When
        double result = atm.deposit(1349872, 25);

        //: Then
        assertEquals("New balance should equal 125", 125, result, 0);
    }

    @Test
    public void CheckingDepositTest(){

        //: Given
        SavingsAccount s = new SavingsAccount(100, 1349872, "Chris Kim", 1234, 50, 3);
        CheckingAccount c = new CheckingAccount(100, 123456, "Chris Kim", 1234);
        BusinessAccount b = new BusinessAccount(700, 1817571239, "Zip Code Wilmington", 1234, 12345678, 500);

        ATM atm = new ATM();

        //: When
        double result = atm.deposit(123456, 25);

        //: Then
        assertEquals("New balance should equal 125", 125, result, 0);
    }

    @Test
    public void BusinessDepositTest(){

        //: Given
        SavingsAccount s = new SavingsAccount(100, 1349872, "Chris Kim", 1234, 50, 3);
        CheckingAccount c = new CheckingAccount(100, 123456, "Chris Kim", 1234);
        BusinessAccount b = new BusinessAccount(700, 1817571239, "Zip Code Wilmington", 1234, 12345678, 500);

        ATM atm = new ATM();

        //: When
        double result = atm.deposit(1817571239, 100);

        //: Then
        assertEquals("New balance should equal 900", 900, result, 0);
    }

}
