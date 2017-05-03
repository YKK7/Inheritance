package abstractClass;

import java.util.ArrayList;

public class ATM{

    private ArrayList<Account> accountsList;

    public ATM(ArrayList<Account> accountsList) {
        this.accountsList = accountsList;
    }

    public ATM(){
        accountsList = new ArrayList<Account>();
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
}
