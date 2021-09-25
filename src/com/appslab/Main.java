package com.company;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Main {

        public static void main(String[] args) {

            System.out.println(isPalindrome("reviver"));

            System.out.println(isPalindrome("shopping"));

        }

    public static boolean isPalindrome(String str){
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        String rev=sb.toString();

        if(str.equals(rev)){
            return true;
        }

        else{
            return false;
        }
    }

}
