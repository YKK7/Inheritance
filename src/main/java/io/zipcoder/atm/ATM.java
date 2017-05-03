package io.zipcoder.atm;

import java.util.ArrayList;

public class ATM{

    private ArrayList<Account> accountsList;
    private boolean verified;

    public ATM(ArrayList<Account> accountsList) {
        this.accountsList = accountsList;
        verified = false;
    }

    public ATM(){
        accountsList = new ArrayList<Account>();
        verified = false;
    }

    public ArrayList<Account> getAccountsList() {
        return accountsList;
    }

    public void setAccountsList(ArrayList<Account> accountsList) {
        this.accountsList = accountsList;
    }

    public void addAccount(Account acc){
        accountsList.add(acc);
    }

    public void closeAccount(int accountNumber){
        for(int i = 0; i < accountsList.size(); i++){
            if(accountsList.get(i).getAccountNumber() == accountNumber) {
                accountsList.remove(i);
                break;
            }
        }
    }

    public boolean isVerified() {
        return verified;
    }

    public boolean login(int accountNumber, int pin){

        Account acct = getAccount(accountNumber);
        if(acct.getPinNumber() == pin){
            verified = true;
        }
        return verified;
    }


    public double withdraw(int acctNumber, double amount){

        Account acct = getAccount(acctNumber);
        return acct.withdraw(amount);
    }

    public double deposit(int acctNumber, double amount){

        Account acct = getAccount(acctNumber);
        return acct.deposit(amount);
    }

    public Account getAccount(int accountNumber){

        for(int i = 0; i < accountsList.size(); i++){
            if(accountsList.get(i).getAccountNumber() == accountNumber)
                return accountsList.get(i);
        }
        return null;
    }

}
