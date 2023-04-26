package com.company.basic_DS;

import java.util.Scanner;

public class Armstrong {
    public static boolean armstrongCheck(int n) {
        int temp=n;
        int rev=0;
        while(n>0){
            int rem=n%10;
            rev+=rem*rem*rem;
            n/=10;
        }
//        if(temp==rev) return true;
//        else return false;
        return temp==rev;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=in.nextInt();
        System.out.println(armstrongCheck(num));
    }
}
