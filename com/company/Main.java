package com.company;

public class Main {

    public static void main(String[] args) {


        String[] rook1 = {"A8", "E8"};
        String[] rook2 = {"B6", "A1"};
        String[] rook3 = {"H3", "H6"};

        System.out.print(RookAttack(rook1) + "\n");
        System.out.print(RookAttack(rook2) + "\n");
        System.out.print(RookAttack(rook3));

    }

     static boolean RookAttack(String[] rook) {
        String rook1 = rook[0];
        String rook2 = rook[1];

        if (rook1.charAt(0) == rook2.charAt(0) || rook1.charAt(1) == rook2.charAt(1))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
