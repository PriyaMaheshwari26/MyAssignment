package com.company.oops;

class SavingsAccount extends Q3Polymorphism2 {
    int totalDeposits = 10000;
    int fixedDepositAmount = 5000;

    SavingsAccount() {
    }

    public int getCash() {
        return this.totalDeposits + this.fixedDepositAmount;
    }
}
