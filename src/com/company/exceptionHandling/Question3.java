package com.company.exceptionHandling;


class SavingAccount{
    long id;
    double balance;

    double withdraw(double amount){
        if(amount>balance){
            throw new RuntimeException("Balance is greater than amount");
        }
        return amount;
    }
    double deposit(double amount){
        if(amount>balance){
            throw new RuntimeException("Balance is greater than amount");
        }
        return amount;
    }
}
public class Question3 {
    public static void main(String[] args) {

    }
}
