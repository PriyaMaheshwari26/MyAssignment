package com.company.lamdaExp;
interface addition{
    double addition();
}
interface subtraction{
    double subtraction();
}
interface multiplication{
    double multiplication();
}
interface division{
    double division();
}
public class Question1 {
    public double addition(int n1,int n2){
        addition add  = () -> {
            return n1 + n2;
        };
        return n1+n2;
    }
    public double subtraction(int n1,int n2){
        subtraction sub = () -> {
            return n1 - n2;
        };
        return n1-n2;

    }
    public double multiplication(int n1,int n2){

        multiplication mul = () -> {
            return  n1*n2;
        };
        return n1*n2;

    }
    public double division(int n1, int n2){
        division div = () ->{return n1/n2;};
        return n1/n2;

    }
    public static void main(String[] args) {
        int a = 50,b=10;
        Question1 object = new Question1();
        System.out.println("Addition of two number "+object.addition(a,b));
        System.out.println("Subtraction Of Two Number "+object.subtraction(a,b));
        System.out.println("Multiplication of two number "+object.multiplication(a,b));
        System.out.println("Division of two number "+object.division(a,b));


    }

}