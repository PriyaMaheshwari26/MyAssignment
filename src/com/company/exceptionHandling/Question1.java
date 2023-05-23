package com.company.exceptionHandling;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number");
        int num1= sc.nextInt();
        System.out.println("Enter Second Number");
        int num2= sc.nextInt();
        try {
            System.out.println(num1+" divided by "+num2+" is: "+num1/num2);
        }
        catch (ArithmeticException e){
            System.out.println("Can not divide by zero");
        }
    }
}
