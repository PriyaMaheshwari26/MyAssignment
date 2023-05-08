package com.company.basic_DS;//package com.company.basic_DS;

import java.util.Arrays;

class BubbleSort{

    public int[] bubbleSort(int arr[]) {
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = 0; j < arr.length - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
        }
        return arr;
    }
}
public class Assignment1Q8 {
    public static void main(String args[]) {

        int arr[] = {5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 37, 7, 52, 86, 47};
        BubbleSort obj = new BubbleSort();
        System.out.println(Arrays.toString(obj.bubbleSort(arr)));
    }
}
