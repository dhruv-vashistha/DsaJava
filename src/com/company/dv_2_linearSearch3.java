package com.company;

public class dv_2_linearSearch3 {
    static boolean findChar(String str, char targetChar){
//        for(int i = 0 ; i< str.length(); i++){
//            if (str.charAt(i) == targetChar){
//                return true;
//            }
//        }
//        return false;
        //or you can do the for each loop
        for (char ch: str.toCharArray()){
            if(targetChar == ch){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        //question - find the character in the string and write the true or false in method.

        System.out.println(findChar("my name is dhruv" , 'u'));

    }
}
