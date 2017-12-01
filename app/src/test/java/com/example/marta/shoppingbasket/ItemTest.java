package com.example.marta.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by marta on 01/12/2017.
 */

public class ItemTest {
    Item item;

    @Before
    public void before() {
        item = new Item(12);
    }

    @Test
    public void testCanGetPrice() {
        assertEquals(12, item.getPrice(), 0.0);
    }

}
