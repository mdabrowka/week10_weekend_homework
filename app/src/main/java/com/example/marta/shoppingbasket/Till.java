package com.example.marta.shoppingbasket;

import java.util.ArrayList;

/**
 * Created by marta on 02/12/2017.
 */

public class Till {
    ShoppingBasket basket;
    Customer customer;


    public double totalPriceAfterDiscount(ShoppingBasket basket) {
        return basket.calculatePriceAfterDiscount();
    }


    public double totalPriceAfterTenPercentOffDiscount(ShoppingBasket basket) {
        double total = basket.calculatePriceAfterDiscount();
        if (total >= 20) {
            total = 0.9 * total;
        }
        return total;
    }


    public double totalPriceAfterLoyaltyCardDiscount(ShoppingBasket basket, Customer customer) {
        double total = totalPriceAfterTenPercentOffDiscount(basket);
        if (customer.isLoyal() == true) {
            total = 0.98 * total;
        }
        return total;
    }



}
