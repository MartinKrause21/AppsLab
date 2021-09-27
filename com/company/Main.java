package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("zadaj slovo: ");
        String word1= sc.nextLine();

        System.out.println("zadaj slovo: ");
        String word2= sc.nextLine();


        if (word1.endsWith(word2)) {
            System.out.println("true");
        }

        else {
            System.out.println("false");
        }

    }
}
