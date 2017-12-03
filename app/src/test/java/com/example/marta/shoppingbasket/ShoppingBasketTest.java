package com.example.marta.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;


/**
 * Created by marta on 01/12/2017.
 */

public class ShoppingBasketTest {
    ShoppingBasket basket;
    Item item1, item2, item3;


    @Before
    public void before() {
        basket = new ShoppingBasket();
        item1 = new Item(10, "orange", 4);
        item2 = new Item(5, "apple", 7);
        item3 = new Item(7, "strawberry", 3);
    }

    @Test
    public void testShoppingBasketStartsEmpty() {
        assertEquals(0, basket.numberOfItems());
    }

    @Test
    public void testCanAddItems() {
        basket.add(item1);
        basket.add(item2);
        assertEquals(2, basket.numberOfItems());
    }

    @Test
    public void testCanRemoveItemsFromBasket() {
        basket.add(item1);
        basket.add(item2);
        basket.add(item3);
        basket.remove(item3);
        assertEquals(2, basket.numberOfItems());
    }

    @Test
    public void testCanEmptyBasket() {
        basket.add(item1);
        basket.add(item2);
        basket.add(item3);
        basket.emptyBasket();
        assertEquals(0, basket.numberOfItems());
    }

    @Test
    public void testCanCalculateTotalAfterTwoForOneDiscount() {
        basket.add(item1);
        basket.add(item2);
        assertEquals(40, basket.totalPriceAfterDiscount(), 0.0);
    }

}
