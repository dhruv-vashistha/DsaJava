package com.company;

import java.util.Scanner;

public class dv_2_linearSearch {
    public static void main(String[] args) {
        //new topic now
        //question 1 - search for the number 14 in array

        Scanner sc = new Scanner(System.in);
        System.out.println("enter how many numbers you wanna put into the array");
        int k = sc.nextByte();
        int[] arr = new int[k];

        //put all the values to the array
        for(int i = 0; i<k; i++){
            System.out.println("enter the " + i + "th index");
            arr[i] = sc.nextInt();
        }

        //displaying the array
        for (int element: arr) {
            System.out.print(element + ", ");
        }
        boolean has14 = false;
        for(int element : arr){
            if(element == 14){
                has14 = true;
                break;
            }
        }
        System.out.println();
        if(has14){
            System.out.println("yes it presents the number fourteen");
        }else{
            System.out.println("it doesn't contain number fourteen");
        }


    }
}
