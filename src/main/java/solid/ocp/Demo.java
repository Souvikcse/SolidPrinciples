package solid.ocp;
/**
 * @author nayanava
 */

import solid.srp.IPersistence;

import java.io.*;

public class Demo {
    public static void main(String[] args) {
        Product product = new Product("Car", Size.LARGE, Color.GREEN, 1000000);
        System.out.println(product);
        Persistence persistence = new FilePersistence("productDetails.txt");
        persist(persistence, product);
    }

    private static void persist(Persistence persistence, Product product) {
        persistence.save(product);
    }
}
