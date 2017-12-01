package com.example.marta.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by marta on 01/12/2017.
 */

public class ShoppingBasketTest {
    ShoppingBasket basket;
    Purchasable item1, item2, item3;


    @Before
    public void before() {
        basket = new ShoppingBasket();
        item1 = new Item(10);
        item2 = new Item(5);
        item3 = new Item(7);
    }

    @Test
    public void testShoppingBasketStartsEmpty() {
        assertEquals(0, basket.numberOfItems());
    }

}
