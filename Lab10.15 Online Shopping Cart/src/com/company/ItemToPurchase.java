package com.company;

public class ItemToPurchase {
    private String itemName;
    private int itemPrice;
    private int itemQuantity;

    public ItemToPurchase(){
        itemName = "None";
        itemPrice = 0;
        itemQuantity = 0;
    }

    /**
    public ItemsToPurchase(String itemName, int itemPrice, int itemQuantity) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemQuantity = itemQuantity;
    }
     */

    public void setName(String itemName) {
        this.itemName = itemName;
    }

    public String getName() {
        return itemName;
    }

    public void setPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getPrice() {
        return itemPrice;
    }

    public void setQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public int getQuantity() {
        return itemQuantity;
    }

    public int getTotal() {
        return itemPrice * itemQuantity;
    }
}
