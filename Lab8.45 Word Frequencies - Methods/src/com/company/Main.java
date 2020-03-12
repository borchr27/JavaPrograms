package com.company;
import java.util.Scanner;

public class Main {

    public static int getFrequencyOfWord(String[] wordsList, int listSize, String currWord){
        int count = 0;
        for (int i = 0; i < listSize; i++){
            if (wordsList[i].equals(currWord)){
                count += 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int numWords = scnr.nextInt();
        String[] wordList = new String[numWords];
        int[] numList = new int[numWords];

        for (int i = 0; i < numWords; i++){
            wordList[i] = scnr.next();
        }

        for (int i = 0; i < numWords; i++){
            System.out.println(wordList[i] + " " + getFrequencyOfWord(wordList, numWords, wordList[i]));
        }
    }
}
