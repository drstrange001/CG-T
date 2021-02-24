package com.example.assignment_3_spring_core;

import java.util.HashMap;
import java.util.Map;

public class BankAccountRepositoryImpl implements BankAccountRepository{

    private static final String ERROR_MESSAGE = "AccountID doesn't match any account!";
    private final Map<Long, BankAccount> accounts = new HashMap<>();

    @Override
    public double getBalance(long accountID) {
        try{
            return accounts.get(accountID).getAccountBalance();
        } catch (Exception e) {
            System.out.println(ERROR_MESSAGE);
            return -1;
        }
    }

    @Override
    public double updateBalance(long accountID, double newBalance) {
        try{
            BankAccount account = accounts.get(accountID);
            account.setAccountBalance(newBalance);
            accounts.put(accountID, account);
            return newBalance;
        } catch (Exception e) {
            System.out.println(ERROR_MESSAGE);
            return -1;
        }

    }

    public void addBankAccount(BankAccount account){
        if(accounts.containsKey(account.getAccountID())){
            System.out.println("account already exists!");
            return;
        }
        accounts.put(account.getAccountID(), account);
    }

}
