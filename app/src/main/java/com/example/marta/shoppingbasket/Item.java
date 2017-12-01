package com.example.marta.shoppingbasket;

/**
 * Created by marta on 01/12/2017.
 */

public class Item implements Purchasable {
    private double price;

    public Item(double price) {
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }
}
