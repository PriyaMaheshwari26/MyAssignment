package com.company.basic_DS;

import java.util.Scanner;
//Slab A                               0-1,80,000                                                                  Nil
//
//        Slab B                               1,81,001-3,00,000                                                    10%
//
//        Slab C                               3,00,001-5,00,000                                                    20%
//
//        Slab D                               5,00,001-10,00,000                                                 30%
class TaxAmount{
    public double calculateTaxAmount(int ctc){
        if(ctc>=0&&ctc<=180000) return 0;
        else if(ctc>=181001&&ctc<=300000) return 10;
        else if(ctc>=300001&&ctc<=500000) return 20;
        else return 30;
    }
}
public class Assignment1Q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the CTC");
        int ctc= sc.nextInt();
        TaxAmount obj=new TaxAmount();
        System.out.println("Tax Payable: "+obj.calculateTaxAmount(ctc)+"%");
    }
}
