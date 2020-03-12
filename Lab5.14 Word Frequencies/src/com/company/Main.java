package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
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
