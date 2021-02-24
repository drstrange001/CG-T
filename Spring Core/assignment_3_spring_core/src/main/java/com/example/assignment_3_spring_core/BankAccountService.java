package com.example.assignment_3_spring_core;

public interface BankAccountService {

    public double withdraw(long accountId, double balance);

    public double deposit(long accountId, double balance);

    public double getBalance(long accountId);

    public boolean fundTransfer(long fromAccount, long toAccount, double amont);

}
