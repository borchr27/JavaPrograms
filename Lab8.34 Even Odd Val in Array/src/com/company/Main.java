package com.company;
import java.util.Scanner;

public class Main {
    public static void largestNumber(int a, int b, int c){
        int max = 0;
        if ((a >= b) && (a >= c)){
            max = a;
        }
        else if ((c >= b) && (c >= a)){
            max = c;
        }
        else max = b;
        System.out.println(max);
    }

    public static void smallestNumber(int a, int b, int c){
        int min = 0;
        if ((a <= b) && (a <= c)){
            min = a;
        }
        else if ((c <= b) && (c <= a)){
            min = c;
        }
        else min = b;
        System.out.println(min);
    }


    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int a = scnr.nextInt();
        int b = scnr.nextInt();
        int c = scnr.nextInt();

        largestNumber(a, b, c);
        smallestNumber(a, b, c);


    }


}
