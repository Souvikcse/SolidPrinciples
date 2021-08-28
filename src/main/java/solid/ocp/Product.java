package solid.ocp;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * @author nayanava
 */

public class Product {
    public String name;
    public Size size;
    public Color color;
    public double price;

    public Product(String name, Size size, Color color, double price) {
        this.name = name;
        this.color = color;
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", color=" + color +
                ", price=" + price +
                '}';
    }
}
