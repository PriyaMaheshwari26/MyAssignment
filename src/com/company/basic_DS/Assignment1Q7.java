package com.company.basic_DS;
class SearchArray{
    public boolean searchArray(int[] arr,int toCheckValue){
        for(int i =0;i<arr.length;i++){
            if(arr[i]==toCheckValue){
                return true;
            }
        }
        return false;
    }
}
public class Assignment1Q7 {
    public static void main(String[] args) {
        int arr[] = { 5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
        int valueToCheck = 19;
        SearchArray object = new SearchArray();
        if(object.searchArray(arr,valueToCheck)){
            System.out.println("Value is present in the given array");
        }
        else{
            System.out.println("Value is not present in the array");
        }
    }
}