package design.patterns.behavioral.strategy;
/**
 * @author nayanava
 */

import design.patterns.behavioral.strategy.impl.CardPaymentStrategy;

import java.io.*;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        Item item1 = new Item(1, "Iphone12", 1, 120000.0);
        Item item2 = new Item(2, "Samsung Galaxy S20+", 2, 70000.0);

        ShoppingCart cart = new ShoppingCart();
        cart.addToCart(item1);
        cart.addToCart(item2);

        System.out.println(cart.makePayment( new CardPaymentStrategy()));
    }
}
