package com.example.marta.shoppingbasket;

import java.util.ArrayList;

/**
 * Created by marta on 01/12/2017.
 */

public class ShoppingBasket {
    private ArrayList<Item> boughtItems;



    public ShoppingBasket() {
        boughtItems = new ArrayList();
    }


    public int numberOfItems() {
      return boughtItems.size();
    }

    public void add(Item item) {
        boughtItems.add(item);
    }

    public void remove(Item item) {
        boughtItems.remove(item);
    }

    public void emptyBasket() {
        boughtItems.clear();
    }

    public double totalPriceAfterDiscount() {
        double total = 0;
        for (Item item : boughtItems) {
          total += item.calculatePriceAfterTwoForOneDiscount();
        }
        return total;
    }






}
