package com.company;
import java.util.Scanner;

public class Main {

    public static void getUserValues(int[] myArr, int arrSize, Scanner scnr){
        for (int i = 0; i < arrSize; i++){
            myArr[i] = scnr.nextInt();
        }
    }

    public static void outputIntsLessThanOrEqualToThreshold(int[] userValues, int userValsSize, int upperThreshold){
        for (int j = 0; j < userValsSize; j++){
            if (userValues[j] <= upperThreshold){
                System.out.print(userValues[j] + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int[] userValues = new int[20];
        int upperThreshold;
        int numVals;

        numVals = scnr.nextInt();
        getUserValues(userValues, numVals, scnr);

        upperThreshold = scnr.nextInt();
        outputIntsLessThanOrEqualToThreshold(userValues, numVals, upperThreshold);
    }


}

