package com.company;

public class dv_2_LEETCodeProblemMeth2 {
    static int isEven(int num){
        return (int)(Math.log10(num));
    }
    public static void main(String[] args) {
        int[] arr = {333, 53, 53, 6, 7888, 22, 97, 333, 77, 2222 ,44, 5};
        int count = 0;
        for (int Element: arr) {
            if (isEven(Element)%2 == 0){
                count++;
            }

        }
        System.out.println("the number of numbers that have even number of digits are: " + count);
    }
}
