package com.company.basic_DS;

import java.util.Scanner;

class SiCi {
    public double simpleInterest(double principalAmount,int time,double interestRate){
        return (principalAmount*time*interestRate)/100;
    }
    public double compoundInterest(double principalAmount,int time,double interestRate){
//        Compound Interest = P(1+r)^t-P
        double p=Math.pow((1+interestRate),time);
        return (principalAmount*p)-principalAmount;
    }
}
public class Assignment1Q3 {
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Principal Amount");
        double p=sc.nextDouble();
        System.out.println("Enter time");
        int t=sc.nextInt();
        System.out.println("Enter Interest Rate");
        double i=sc.nextDouble();
        SiCi obj=new SiCi();
        System.out.println(obj.simpleInterest(p,t,i));
        System.out.println(obj.compoundInterest(p,t,i));

    }
}