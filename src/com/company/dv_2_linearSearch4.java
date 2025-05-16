package com.company;

public class dv_2_linearSearch4 {
    static int getLeast(int[] arr){
        int leastInt = 100;
        for(int i = 0; i<arr.length; i++){
            if (arr[i] < leastInt){
                leastInt = arr[i];
            }
        }
        return leastInt;
    }
    public static void main(String[] args) {
        //question - find the least number in the array
        int[] arr = {22, 63, 44, 16, 5, 33, 88, 2, 84};
        System.out.println("the least number in the array is " + getLeast(arr));


    }
}
