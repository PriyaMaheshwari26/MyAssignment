package com.company.basic_DS;

import java.util.ArrayList;
import java.util.Arrays;

import static com.company.basic_DS.Armstrong.armstrongCheck;

class ArmstrongNumBetweenRange{
    public int[] armstrongNumbersInRange(int min , int max){
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=min;i<=max;i++){
            if(armstrongCheck(i)){
                list.add(i);
            }
        }
        int n= list.size();
        int[] arr=new int[n];
        for (int i = 0; i <n; i++) {
            arr[i]=list.get(i);
        }
        return arr;
    }
}

public class Assignment1Q2 {
    public static void main (String [] args) {

       int min = 100;int max = 999;
       ArmstrongNumBetweenRange obj=new ArmstrongNumBetweenRange();
        System.out.println(Arrays.toString(obj.armstrongNumbersInRange(min,max)));

    }
}