package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Zadaj prve cislo: ");
        int a = sc.nextInt() ;


        System.out.println("Zadaj druhe cislo: ");
        int b = sc.nextInt();


        System.out.println("Zadaj tretie cislo: ");
        int c = sc.nextInt() ;

         if (a + b > c && b + c > a && a + c > b ) {
            System.out.print("true");
        }

        else {
            System.out.print("false");
        }

    }
}