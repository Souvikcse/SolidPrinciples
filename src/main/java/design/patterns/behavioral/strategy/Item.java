package design.patterns.behavioral.strategy;
/**
 * @author nayanava
 */

import java.io.*;

public class Item {
    private int itemId;
    private String itemName;
    private int quantity;
    private Double itemPrice;
    public Item(int itemId, String itemName, int quantity, Double itemPrice) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.quantity = quantity;
        this.itemPrice = itemPrice;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(Double itemPrice) {
        this.itemPrice = itemPrice;
    }
}
