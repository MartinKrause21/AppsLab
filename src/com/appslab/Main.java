package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] array = { 44, 32, 86, 19, 60, 14};


        int max = Arrays.stream(array).max().getAsInt();
        int min = Arrays.stream(array).min().getAsInt();

        System.out.printf("Rozdiel cisel je: ");
            System.out.println(max - min);
        }
    }
