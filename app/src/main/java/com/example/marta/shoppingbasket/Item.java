package com.example.marta.shoppingbasket;

/**
 * Created by marta on 01/12/2017.
 */

public class Item implements Purchasable {
    private double price;
    private String type;

    public Item(double price, String type) {
        this.price = price;
        this.type = type;
    }

    public double getPrice() {
        return this.price;
    }


    public String getType() {
        return this.type;
    }
}
