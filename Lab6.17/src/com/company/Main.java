package com.company;
import java.util.Scanner;

/*
Write a program that reads a list of words. Then, the program
 outputs those words and their frequencies. The input begins
 with an integer indicating the number of words that follow.
 Assume that the list will always contain fewer than 20 words.

Ex: If the input is:
5 hey hi Mark hi mark

The output is:
hey 1
hi 2
Mark 1
hi 2
mark 1
 */

public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int numWords;

        numWords = scnr.nextInt();
        String[] wordList = new String[numWords];
        int[] numList = new int[numWords];

        for (int i = 0; i < numWords; i++){
            wordList[i] = scnr.next();
        }

        for (int l = 0; l < numWords; l++)
        {
            for (int m = 0; m < numWords; m++)
            {
                if (wordList[l].equals(wordList[m]))
                {
                    numList[l] += 1;
                }
            }
        }


        for (int i = 0; i < numWords; i++){
            System.out.println(wordList[i] + " " + numList[i]);
        }


    }
}

