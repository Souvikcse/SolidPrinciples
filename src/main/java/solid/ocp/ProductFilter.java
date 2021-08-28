package solid.ocp;
/**
 * @author nayanava
 */

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class ProductFilter {
    public Stream<Product> filterByColor(List<Product> products, Color color) {
        List<Product> filteredList = new LinkedList<>();
        for(Product product : products) {
            if(product.color == color) {
                filteredList.add(product);
            }
        }
        return filteredList.stream();
        //return products.stream().filter(product -> product.color == color);
    }

    public Stream<Product> filterBySize(List<Product> products, Size size) {
        return products.stream().filter(product -> product.size == size);
    }

    public Stream<Product> filterByColorAndSize(List<Product> products, Color color, Size size) {
        return products.stream().filter(product -> product.color == color && product.size == size);
    }
}
