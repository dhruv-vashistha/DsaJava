package com.company;

public class dv_2_linearSearchInRange {
    static boolean search(int startInd, int endInd, int Target, int[] arr){
        for(int i = startInd; i <= endInd; i++){
            if (arr[i] == Target){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] array = {5,2,5,2,5,2,5,4,7,8,3,9};
        boolean a = search(3, 9,3, array);
        System.out.println(a);
    }
}
