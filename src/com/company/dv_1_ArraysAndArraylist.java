package com.company;

public class dv_1_ArraysAndArraylist {
    static void putValue(int a){
        int k = 0;
        int[] rollNo;
        rollNo = new int[100];
        rollNo [k] = a;
        k++;
        for (int i= 0; i< k ; i++){
            System.out.print(rollNo[i]);
        }
    }

    public static void main(String[] args) {
        System.out.println("Array in java");

        putValue(3);
        System.out.println();
        putValue(3);
        System.out.println();
        putValue(99);
        System.out.println();
        putValue(38);


    }
}
