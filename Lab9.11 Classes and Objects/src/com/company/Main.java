package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        Triangle triangle1 = new Triangle();
        Triangle triangle2 = new Triangle();

        // TODO: Read and set base and height for triangle1 (use setBase() and setHeight())
        triangle1.setBase(scnr.nextDouble());
        triangle1.setHeight(scnr.nextDouble());

        // TODO: Read and set base and height for triangle2 (use setBase() and setHeight())
        triangle2.setBase(scnr.nextDouble());
        triangle2.setHeight(scnr.nextDouble());

        // TODO: Determine larger triangle (use getArea())
        if (triangle1.getArea() > triangle2.getArea()){
            System.out.println("Triangle with larger area:");
            triangle1.printInfo();
        } else {
            System.out.println("Triangle with larger area:");
            triangle2.printInfo();
        }

    }
}
