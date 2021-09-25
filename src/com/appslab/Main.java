package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Zadaj celkovy pocet kuskov: ");
        int TotalSlices = sc.nextInt() ;


        System.out.println("Zadaj pocet osob: ");
        int NoRecipients = sc.nextInt();


        System.out.println("Zadaj pocet kuskov pre osobu: ");
        int SlicesEach = sc.nextInt() ;

         if (  NoRecipients*SlicesEach <= TotalSlices  ) {
            System.out.print("true");
        }

        else {
            System.out.print("false");
        }

    }
}