package com.company.basic_DS;

import java.util.Scanner;

class ResultDeclaration{
    public String declareResults( double subject1Marks, double subject2Marks, double subject3Marks) {
//        Condition 1: -All subjects marks is greater than 60 is Passed
//
//        Condition 2: -Any two subjects marks are greater than 60 is Promoted
//
//        Condition 3: -Any one subject mark is greater than 60 or all subjects’ marks less than 60 is failed.
        if((subject1Marks>=60||subject2Marks>=60||subject3Marks>=60)||subject1Marks+subject2Marks+subject3Marks<60)return "Failed";
        if(subject1Marks+subject2Marks+subject3Marks>60){
            if(subject1Marks+subject2Marks>60||subject1Marks+subject3Marks>60||subject2Marks+subject3Marks>60) return "Pass \nPromoted";
            else return "Pass";
        }

        return null;
    }
}
public class Assignment1Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks");
        double subject1Marks= sc.nextDouble();
        double subject2Marks= sc.nextDouble();
        double subject3Marks= sc.nextDouble();
        ResultDeclaration obj=new ResultDeclaration();
        System.out.println(obj.declareResults(subject1Marks,subject2Marks,subject3Marks));

    }
}