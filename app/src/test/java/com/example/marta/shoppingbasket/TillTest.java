package com.example.marta.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by marta on 03/12/2017.
 */

public class TillTest {
    Till till;
    ShoppingBasket basket;
    Item item1, item2, item3;
    Customer customer;


    @Before
    public void before() {
        till = new Till();
        basket = new ShoppingBasket();
        item1 = new Item(10, "orange", 4);
        item2 = new Item(5, "apple", 7);
        item3 = new Item(7, "strawberry", 3);
        customer = new Customer(true);
    }


    @Test
    public void testCanCalculateTenPercentDiscount() {
        basket.add(item1);
        basket.add(item2);
        assertEquals(36, till.totalPriceAfterTenPercentOffDiscount(basket), 0.0);
    }

    @Test
    public void testWillNotApplyDiscountIfTotalUnder20() {
        basket.add(item3);
        assertEquals(14, till.totalPriceAfterTenPercentOffDiscount(basket), 0.0);
    }

    @Test
    public void testCanCalculateLoyaltyCardDiscount() {
        basket.add(item1);
        basket.add(item2);
        assertEquals(35.28, till.totalPriceAfterLoyaltyCardDiscount(basket, customer), 0.0);
    }


}
