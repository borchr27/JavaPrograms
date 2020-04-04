package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Scanner scnr = new Scanner(System.in);

        /* Type your code here. */
        ItemToPurchase item1 = new ItemToPurchase();

        System.out.println("Item 1");
        System.out.println("Enter the item name: ");
        item1.setName(scnr.nextLine());
        System.out.println("Enter the item price: ");
        item1.setPrice(scnr.nextInt());
        System.out.println("Enter the item quantity: ");
        item1.setQuantity(scnr.nextInt());
        System.out.println();

        ItemToPurchase item2 = new ItemToPurchase();
        scnr.nextLine();

        System.out.println("Item 2");
        System.out.println("Enter the item name: ");
        item2.setName(scnr.nextLine());
        System.out.println("Enter the item price: ");
        item2.setPrice(scnr.nextInt());
        System.out.println("Enter the item quantity: ");
        item2.setQuantity(scnr.nextInt());
        System.out.println();

        System.out.println("TOTAL COST");
        System.out.println(item1.getName() + " " + item1.getQuantity() + " @ $" + item1.getPrice() + " = $" + item1.getTotal());
        System.out.println(item2.getName() + " " + item2.getQuantity() + " @ $" + item2.getPrice() + " = $" + item2.getTotal());
        System.out.println();
        System.out.println("Total: $" + (item1.getTotal() + item2.getTotal()));


    }
}
