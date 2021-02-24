package com.example.assignment_3_spring_core;

import java.util.HashMap;
import java.util.Map;

public class BankAccountServiceImpl implements BankAccountService{

    private static final String ERROR_MESSAGE = "AccountID doesn't match any account!";
    private static final String LOW_BALANCE_MESSAGE = "Sorry you don't have enough balance in you account.";
    private final Map<Long, BankAccount> accounts = new HashMap<>();

    @Override
    public double withdraw(long accountId, double balance) {
        try{
            BankAccount account = accounts.get(accountId);
            if(account.getAccountBalance() < balance){
                System.out.println(LOW_BALANCE_MESSAGE);
            }else{
                double newBalance = account.getAccountBalance()-balance;
                account.setAccountBalance(newBalance);
                accounts.put(accountId, account);
            }
            return account.getAccountBalance();
        } catch (Exception e) {
            System.out.println(ERROR_MESSAGE);
            return -1;
        }
    }

    @Override
    public double deposit(long accountId, double balance) {
        try{
            BankAccount account = accounts.get(accountId);
            double newBalance = account.getAccountBalance()+balance;
            account.setAccountBalance(newBalance);
            accounts.put(accountId, account);
            return account.getAccountBalance();
        } catch (Exception e) {
            System.out.println(ERROR_MESSAGE);
            return -1;
        }
    }

    @Override
    public double getBalance(long accountId) {
        try{
            BankAccount account = accounts.get(accountId);
            return account.getAccountBalance();
        } catch (Exception e) {
            System.out.println(ERROR_MESSAGE);
            return -1;
        }
    }

    @Override
    public boolean fundTransfer(long fromAccountId, long toAccountId, double amount) {
        try{
            BankAccount fromAccount = accounts.get(fromAccountId);
            BankAccount toAccount = accounts.get(toAccountId);
            if(fromAccount.getAccountBalance() < amount){
                System.out.println(LOW_BALANCE_MESSAGE);
            }else{
                double fromAccountNewBalance = fromAccount.getAccountBalance()-amount;
                double toAccountNewBalance = toAccount.getAccountBalance()+amount;
                fromAccount.setAccountBalance(fromAccountNewBalance);
                toAccount.setAccountBalance(toAccountNewBalance);
                accounts.put(fromAccountId, fromAccount);
                accounts.put(toAccountId, toAccount);
            }
            return true;
        } catch (Exception e) {
            System.out.println(ERROR_MESSAGE);
            return false;
        }
    }

}
