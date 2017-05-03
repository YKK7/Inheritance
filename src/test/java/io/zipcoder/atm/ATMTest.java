package io.zipcoder.atm;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ATMTest {

    CheckingAccount c;
    SavingsAccount s;
    BusinessAccount b;
    ATM atm;

    @Before
    public void initialize() {
        //Given
        c = new CheckingAccount(100, 123456, "Chris Kim", 1234);
        s = new SavingsAccount(100, 1349872, "Chris Kim", 1234, 50, 3);
        b = new BusinessAccount(800, 1817571239, "Zip Code Wilmington", 1234, 12345678, 500);
        atm = new ATM();
        atm.addAccount(c);
        atm.addAccount(s);
        atm.addAccount(b);
    }

    @Test
    public void addAccountTest(){

        //: Then
        assertEquals("There should be 3 accounts", 3, atm.getAccountsList().size());
    }

    @Test
    public void closeAccountTest(){

        //: When
        atm.closeAccount(1817571239);

        //: Then
        assertEquals("There should be 2 accounts", 2, atm.getAccountsList().size());
    }

    @Test
    public void loginTest(){

        //: When
        boolean result = atm.login(123456, 1234);

        //: Then
        assertEquals("verified should be set to true", true, atm.isVerified());
    }

    @Test
    public void getAccountTest(){


        //: When
        Account result = atm.getAccount(123456);

        //: Then
        assertEquals("getAccount should return the account in accountList", atm.getAccountsList().get(0), result);
    }

    @Test
    public void SavingsWithdrawalTest(){

        //: When
        double result = atm.withdraw(1349872, 25);

        //: Then
        assertEquals("New balance should equal 75", 75, result, 0);
    }

    @Test
    public void CheckingWithdrawalTest(){

        //: When
        double result = atm.withdraw(123456, 25);

        //: Then
        assertEquals("New balance should equal 75", 75, result, 0);
    }

    @Test
    public void BusinessWithdrawalTest(){

        //: When
        double result = atm.withdraw(1817571239, 100);

        //: Then
        assertEquals("New balance should equal 700", 700, result, 0);
    }

    @Test
    public void SavingsDepositTest(){

        //: When
        double result = atm.deposit(1349872, 25);

        //: Then
        assertEquals("New balance should equal 125", 125, result, 0);
    }

    @Test
    public void CheckingDepositTest(){

        //: When
        double result = atm.deposit(123456, 25);

        //: Then
        assertEquals("New balance should equal 125", 125, result, 0);
    }

    @Test
    public void BusinessDepositTest(){

        //: When
        double result = atm.deposit(1817571239, 100);

        //: Then
        assertEquals("New balance should equal 900", 900, result, 0);
    }

}
