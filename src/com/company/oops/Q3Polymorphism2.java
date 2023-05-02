
package com.company.oops;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public abstract class Q3Polymorphism2 {
    public Q3Polymorphism2() {
    }

    public int getCash() {
        return 10000;
    }

    public static int totalCashInBank(ArrayList<Integer> cash) {
        int sum = 0;

        int i;
        for(Iterator var2 = cash.iterator(); var2.hasNext(); sum += i) {
            i = (Integer)var2.next();
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SavingsAccount savingsAccount = new SavingsAccount();
        CurrentAccount currentAccount = new CurrentAccount();
        ArrayList<Integer> cash = new ArrayList();

        for(int i = 1; i <= 5; ++i) {
            System.out.println("Bank Type");
            String bankType = sc.nextLine();
            if (bankType.equals("Saving Account")) {
                cash.add(savingsAccount.getCash());
            } else if (bankType.equals("Current Account")) {
                cash.add(currentAccount.getCash());
            } else {
                cash.add(10000);
            }
        }

        System.out.println("Total Cash in the Bank :- " + totalCashInBank(cash));
    }
}
