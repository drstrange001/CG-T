package com.example.assignment_3_spring_core;

public interface BankAccountRepository {

    public double getBalance(long accountID);

    public double updateBalance(long accountID, double newBalance);

}
