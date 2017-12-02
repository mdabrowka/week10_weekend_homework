package com.example.marta.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;

/**
 * Created by marta on 01/12/2017.
 */

public class ItemTest {
    Item item, item1;

    @Before
    public void before() {
        item = new Item(12, "shoelaces", 4);
        item1 = new Item(6, "toothpaste", 3);
    }

    @Test
    public void testCanGetPrice() {
        assertEquals(12, item.getPrice(), 0.0);
    }

    @Test
    public void testCanGetType() {
        assertEquals("shoelaces", item.getType());
    }

    @Test
    public void testCanGetQuantity() {
        assertEquals(4, item.getQuantity());
    }

//    @Test
//    public void testReturnsTrueIfQuantityDivisibleByTwo() {
//        assertEquals(true, item.quantityDivisableByTwo());
//    }
//
//    @Test
//    public void testReturnsFalseIfQuantityNotDivisiableByTwo() {
//        assertEquals(false, item1.quantityDivisableByTwo());
//    }
//
//    @Test
//    public void testApplyTwoForOneDiscountNoModulus() {
//        assertEquals(24, item.applyTwoForOneDiscountNoModulus(), 0.0);
//    }
//
//    @Test
//    public void testApplyTwoForOneDiscountWithModulus() {
//        assertEquals(12, item1.applyDiscountTwoForOneWithModulus(), 0.0);
//    }

    @Test
    public void testApplyTwoForOneDiscount() {
        assertEquals(24, item.applyTwoForOneDiscount(), 0.0);
        assertEquals(12, item1.applyTwoForOneDiscount(), 0.0);
    }
}
