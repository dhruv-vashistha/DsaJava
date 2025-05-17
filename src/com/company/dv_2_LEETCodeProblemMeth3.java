package com.company;

public class dv_2_LEETCodeProblemMeth3 {
    static char[] toString(int num){
        String a = Integer.toString(num);
        return a.toCharArray();
    }
    public static void main(String[] args) {
        int[] arr = {333, 53, 53, 6, 7888, 22, 97, 333, 77, 2222 ,44, 5};
        int count = 0;
        for(int element: arr){
           char[] a = toString(element);
           if (a.length %2 == 0){
               count++;
           }
        }
        System.out.println("the number of numbers that have even number of digits are: " + count);

    }
}
