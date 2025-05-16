package com.company;

public class dv_2_linearSearchIn2DArray {
    static void search2D(int target, int[][] array){
        for (int i = 0; i<array.length; i++){
            for (int j = 0; j<array[i].length; j++){
                if(target == array[i][j]){
                    System.out.println("row " + i + " column " + j);;
                }
            }
        }
    }
    public static void main(String[] args) {
        //making a 2d array for the linear search
        boolean isPresent = false;
        int[][] arr = {
                {3, 4, 6, 9},
                {3, 5, 2},
                {3}
        };

        search2D(2,arr);

    }
}
