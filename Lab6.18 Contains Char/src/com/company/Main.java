package com.company;
import java.util.Scanner;

/*
Write a program that reads an integer, a list of words,
and a character. The integer signifies how many words are
 in the list. The output of the program is every word in
 the list that contains the character at least once. Assume
 at least one word in the list will contain the given character.
 Assume that the list of words will always contain fewer than 20 words.

Ex: If the input is:
4 hello zoo sleep drizzle z

Then the output is:
zoo
drizzle
 */

public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        char charContain;
        int numWords;

        numWords = scnr.nextInt();
        String[] wordList = new String[numWords];
        int[] numList = new int[numWords];

        for (int i = 0; i < numWords; i++){
            wordList[i] = scnr.next();
        }
        charContain = scnr.next().charAt(0);

        for (String tag: wordList)
        {
            if (tag.indexOf(charContain) >= 0)
            {
                System.out.println(tag);
            }
        }
    }
}

