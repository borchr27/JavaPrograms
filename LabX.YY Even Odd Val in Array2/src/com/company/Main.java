package com.company;
import java.util.Scanner;
// M. Borchers, Java Class 2020, Prof. Resendiz

// Method takes array of numbers in and determines if the array is even or odd
// The first number is the length of the array, up to but not exceeding 20

public class Main {

    public static boolean isArrayEven(int[] arrayValues, int arraySize){
        for (int i = 0; i < arraySize; i++){
            if (arrayValues[i] % 2 == 0){
                return true;
            }
        }
        return false;
    }

    public static boolean isArrayOdd(int[] arrayValues, int arraySize){
        for (int i = 0; i < arraySize; i++){
            if (arrayValues[i] % 2 == 1){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int array_len = scnr.nextInt();
        int [] nums = new int[array_len];

        for (int i = 0; i < array_len; i++) {
            nums[i] = scnr.nextInt();
        }

        if ((isArrayOdd(nums, array_len)) && (isArrayEven(nums, array_len))){
            System.out.println("not even or odd");
        }
        else if ((!isArrayOdd(nums, array_len)) && (isArrayEven(nums, array_len))){
            System.out.println("all even");
        }
        else {System.out.println("all odd");}

    }
}
