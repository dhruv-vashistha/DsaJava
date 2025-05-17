package com.company;

public class dv_2_LEETCode_bank {
    static int[] hasMost(int[][] array) {
        int[] ans = new int[array.length];
        for (int j = 0; j < array.length; j++) {
        int sum = 0;
        for (int i = 0; i < array[j].length; i++) {
            sum = sum + array[j][i];
        }
        ans[j] = sum;
        }
        return ans;

    }
    public static void main(String[] args) {
        //question - make an array 2d and save the persons savings and tell which of them has the most.
        int[][] arr = {
                {3, 3, 6},
                {3, 5},
                {2, 5, 3, 4}
        };
        int[] arr1 = hasMost(arr);
        int index = -1;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr1.length; i++) {
            if(max<arr1[i]){
                max = arr1[i];
                index = i;
            }
        }
        System.out.println("the maximum account balance is " + max + " which is at the index " + index );
    }
}
