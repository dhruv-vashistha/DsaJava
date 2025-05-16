package com.company;

import java.util.Scanner;

public class dv_2_linearSearch2 {
    static int linearSearch(int k, int[] arr){
        for (int i =0; i< arr.length; i++){
            if(arr[i] == k){
                System.out.println();
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        //we're finding the number that we put is present in the array or not.
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number that you wanna search for: ");
        int k = sc.nextInt();
        int[] array = {3, 3 ,3, 5, 3, 5, 3 ,52, 5};
        int result = linearSearch(k, array);

        if (result == -1){
            System.out.println("we could not find the number in the array");
        }
        else {
            System.out.println("the element is found on the " + result + "th index of the array");
        }

    }
}
