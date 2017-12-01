package com.example.marta.shoppingbasket;

import java.util.ArrayList;

/**
 * Created by marta on 01/12/2017.
 */

public class ShoppingBasket {
    private ArrayList<Purchasable> boughtItems;



    public ShoppingBasket() {
        boughtItems = new ArrayList();
    }


    public int numberOfItems() {
      return boughtItems.size();
    }

    public void add(Purchasable item) {
        boughtItems.add(item);
    }

    public void remove(Purchasable item) {
        boughtItems.remove(item);
    }
}
