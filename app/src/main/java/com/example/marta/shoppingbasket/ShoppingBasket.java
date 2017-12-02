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

    public void emptyBasket() {
        boughtItems.clear();
    }

    public double totalPrice() {
        double total = 0;
        for (Purchasable item : boughtItems) {
          total += item.getPrice();
        }
        return total;
    }

////    public void checkifanyitemsappeartwiceormoeinthebasket
//    iterate over boughtItems and store the data in a hashmap to know
////            how many of each items you have
//    if any items are 2 or more then apply discout on those


}
