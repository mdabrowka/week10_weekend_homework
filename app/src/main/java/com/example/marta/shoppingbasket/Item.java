package com.example.marta.shoppingbasket;

/**
 * Created by marta on 01/12/2017.
 */

public class Item implements Purchasable {
    private double price;
    private String type;
    private int quantity;

    public Item(double price, String type, int quantity) {
        this.price = price;
        this.type = type;
        this.quantity = quantity;
    }

    public double getPrice() {
        return this.price;
    }


    public String getType() {
        return this.type;
    }

    public int getQuantity() {
        return this.quantity;
    }
}
