package io.zipcoder.atm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccountTest {

    @Test
    public void checkingWithdrawalTest(){

        //: Given
        CheckingAccount c = new CheckingAccount(100, 123456, "Chris Kim", 1234);

        //: When
        double actual = c.withdraw(50);

        //: Then
        assertEquals("The new balance should be 50.0", 50, c.getBalance(), 0);
        assertEquals("The withdraw method should return 50.0", 50, actual, 0);
    }

    @Test
    public void checkingWithdrawalInsufficientTest(){

        //: Given
        CheckingAccount c = new CheckingAccount(100,123456, "Chris Kim", 1234);

        //: When
        double actual = c.withdraw(150);

        //: Then
        assertEquals("The new balance should not have changed from 100.0", 100, c.getBalance(), 0);
        assertEquals("The withdraw method should return 100.0", 100, actual, 0);
    }



    @Test
    public void savingsWithdrawalTest(){

        //: Given
        SavingsAccount s = new SavingsAccount(100, 123456, "Chris Kim", 1234, 50, 3);

        //: When
        double actual = s.withdraw(50);

        //: Then
        assertEquals("The new balance should be 50.0", 50, s.getBalance(), 0);
        assertEquals("The withdraw method should return 50.0", 50, actual, 0);

    }

    @Test
    public void savingsWithdrawalInsufficientTest(){

        //: Given
        SavingsAccount s = new SavingsAccount(200, 123456, "Chris Kim", 1234, 50, 3);

        //: When
        double actual = s.withdraw(150.01);

        //: Then
        assertEquals("The new balance should not have changed from 200.0", 200, s.getBalance(), 0);
        assertEquals("The withdraw method should return 20.0", 200, actual, 0);
    }

    @Test
    public void savingsWithdrawalNumberExceededTest(){

        //: Given
        SavingsAccount s = new SavingsAccount(1000, 123456, "Chris Kim", 1234, 50, 2);

        //: When
        double attempt1 = s.withdraw(100);
        double attempt2 = s.withdraw(100);
        double attempt3 = s.withdraw(100);

        //: Then
        assertEquals("The balance should be 800, since only 2 withdrawals are allowed", 800, s.getBalance(), 0);
        assertEquals("The withdraw method should return 800.0", 800, attempt3, 0);
    }

    @Test
    public void businessWithdrawalTest(){

        //: Given
        BusinessAccount b = new BusinessAccount(700, 123456, "Zip Code Wilmington", 1234, 12345678, 500);

        //: When
        double actual = b.withdraw(100);

        //: Then
        assertEquals("The new balance should be 600.0", 600, b.getBalance(), 0);
        assertEquals("The withdraw method should return 600.0", 600, actual, 0);

    }

    @Test
    public void businessWithdrawalInsufficientTest(){

        //: Given
        BusinessAccount b = new BusinessAccount(700, 123456, "Zip Code Wilmington", 1234, 12345678, 500);

        //: When
        double actual = b.withdraw(300);

        //: Then
        assertEquals("The new balance should not have changed from 700.0", 700, b.getBalance(), 0);
        assertEquals("The withdraw method should return 700.0", 700, actual, 0);
    }



}
