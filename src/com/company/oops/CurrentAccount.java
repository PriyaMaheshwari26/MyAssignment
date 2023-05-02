package com.company.oops;

class CurrentAccount extends Q3Polymorphism2 {
    int totalDeposits = 10000;
    int creditLimit = 2000;

    CurrentAccount() {
    }

    public int getCash() {
        return this.totalDeposits + this.creditLimit;
    }
}
