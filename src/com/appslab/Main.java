package com.appslab;

public class Main {

    public static void main(String[] args) {

        int a =  5;   //Integer.parseInt(bu.readLine());
        int b =  5;  //Integer.parseInt(bu.readLine());
        int c =  3;  //Integer.parseInt(bu.readLine());

        if (a == b && b == c) {
            System.out.print(3);

        }

        else if (a == b || b == c || a == c  ) {
            System.out.print(2);
        }

        else {
            System.out.print(0);
        }

    }
}