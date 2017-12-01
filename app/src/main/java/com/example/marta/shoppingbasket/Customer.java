package com.example.marta.shoppingbasket;

/**
 * Created by marta on 01/12/2017.
 */

public class Customer {
    private boolean loyaltyCard;


    public Customer(boolean loyaltyCard) {
        this.loyaltyCard = loyaltyCard;
    }


    public boolean isLoyal() {
        return this.loyaltyCard;
    }
}
