package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int a []  = {2, 8, 7, 5};
        warOfNumbers(a);
    }

    private static void warOfNumbers (int [] a ) {
        int sum01 = 0;
        int sum02 = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                sum01 = sum01 + a[i];
            }

            else {
                sum02 = sum02 + a[i];
            }

        }
        if (sum02 > sum01) {
            System.out.println(sum01);
        }
        else {
            System.out.println(sum02);
        }
    }

}
