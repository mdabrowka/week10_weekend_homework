package com.example.marta.shoppingbasket;

/**
 * Created by marta on 01/12/2017.
 */

public class Item implements Purchasable, Discountable {
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


    public boolean quantityDivisableByTwo() {
        if (quantity % 2 == 0) {
            return true;
        }
        return false;
    }


//    public double applyTwoForOneDiscount() {
//        double totalPrice = 0.0;
//        if (quantityDivisableByTwo() == true) {
//            totalPrice = ((quantity / 2) * price);
//        }
//        return totalPrice;
//    }
}
