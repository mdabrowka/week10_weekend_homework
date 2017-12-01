package com.example.marta.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by marta on 01/12/2017.
 */

public class CustomerTest {
    Customer customer;

    @Before
    public void before() {
        customer = new Customer(true);
    }

    @Test
    public void canCheckIfCustomerHasALoyaltyCard() {
        assertEquals(true, customer.isLoyal());
    }


}
