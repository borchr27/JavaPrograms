package com.company;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    // TODO: Define a PrintArrayList method that prints an ArrayList of plant (or flower) objects
    public static void PrintArrayList(ArrayList<Plant> objList){
        for (int i = 0; i < objList.size(); ++i) {
            objList.get(i).printInfo();
        }
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String input;
        // TODO: Declare an ArrayList called myGarden that can hold object of type plant
        ArrayList<Plant> myGarden = new ArrayList<Plant>();
        // TODO: Declare variables - plantName, plantCost, colorOfFlowers, isAnnual
        String plantName, plantCost, colorOfFlowers, isAnnual;

        input = scnr.next();

        while(!input.equals("-1")){
            // TODO: Check if input is a plant or flower
            //       Store as a plant object or flower object
            //       Add to the ArrayList myGarden
            if (input.equals("flower")){
                Flower myFlower = new Flower();
                plantName = scnr.next();
                plantCost = scnr.next();
                isAnnual = scnr.next();
                colorOfFlowers = scnr.next();
                if (isAnnual.equals("true")){
                    myFlower.setPlantType(true);
                } else { myFlower.setPlantType(false); }

                myFlower.setPlantCost(plantCost);
                myFlower.setPlantName(plantName);
                myFlower.setColorOfFlowers(colorOfFlowers);
                myGarden.add(myFlower);
            }
            else if (input.equals("plant")){
                Plant myPlant = new Plant();
                plantName = scnr.next();
                plantCost = scnr.next();
                myPlant.setPlantCost(plantCost);
                myPlant.setPlantName(plantName);
                myGarden.add(myPlant);
            }
            else {System.out.println("Please try again");}
            input = scnr.next();
        }

        // TODO: Call the method PrintArrayList to print myGarden
        PrintArrayList(myGarden);
    }
}
