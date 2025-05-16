package com.company;

public class dv_2_linearSearch_LEETCode {
    static String isEven(int num){
        int count = 0;
        while(num>0){
            count++;
            num = num/10;
        }
        if(count%2 == 0){
           return "yes";
        }
        return "no";
    }
    static int countNum(int[] array){
        int numOfNum = 0;
        for(int element: array){
            String result = isEven(element);
            if (result.equals("yes")){
                numOfNum++;
            }
        }
        return numOfNum;

    }
    public static void main(String[] args) {
        //question 1 - how many numbers in the array have the even number of the digits.
        int[] arr = {32, 634, 2888, 73, 8, 999, 91, 8844};
        System.out.println("the number of numbers having the even digits are " + countNum(arr));

    }
}
