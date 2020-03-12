package com.company;
import java.util.Scanner;

/*
Write a program that first gets a list of integers from input.
The input begins with an integer indicating the number of integers
that follow. Assume that the list will always contain fewer
than 20 integers.

That list is followed by two more integers representing lower
and upper bounds of a range. Your program should output all
integers from the list that are within that range (inclusive
of the bounds). For coding simplicity, follow each output integer
 by a space, even the last one. The output ends with a newline.

Ex: If the input is:
5 25 51 0 200 33
0 50

Then the output is:
25 0 33
 */

public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner (System.in);
        // Setup and initialize
        int numVals = scnr.nextInt();
        int[] arr = new int[numVals];
        // Take in user input variables
        for (int i = 0; i < numVals; i++)
        {
            arr[i] = scnr.nextInt();
        }
        // Take in user input for min and max
        int min = scnr.nextInt();
        int max = scnr.nextInt();

        // Print out values that fall in between min and max in no particular order
        for (int item : arr)
        {
            if (item >= min && item <= max)
            {
                System.out.print(item + " ");
            }
        }
        System.out.println();
    }
}