package design.patterns.behavioral.strategy;
/**
 * @author nayanava
 */

import java.io.*;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ShoppingCart {
    Set<Item> items = new LinkedHashSet<>();

    public void addToCart(Item item) {
        items.add(item);
    }

    public void removeFromCart(Item item) {
        items.remove(item);
    }

    public double totalValueOfCart() {
        double valueOfCart = 0;
        for(Item item : items) {
            valueOfCart += item.getItemPrice();
        }
        return valueOfCart;
    }

    public String makePayment(PaymentStrategy paymentStrategy) {
        return paymentStrategy.pay(totalValueOfCart());
    }
}
