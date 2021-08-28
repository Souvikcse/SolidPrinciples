package solid.ocp;
/**
 * @author nayanava
 */

import java.util.List;
import java.util.stream.Stream;

public class OCPDemo {
    public static void main(String[] args) {
        Product apple = new Product("Apple", Size.SMALL, Color.GREEN, 20);
        Product house = new Product("House", Size.HUGE, Color.BLUE, 10000000);
        Product car = new Product("Car", Size.MEDIUM, Color.GREEN, 1000000);

        List<Product> products = List.of(apple, house, car);
        //ocpViolatedApproach(products);
        ocpApproach(products);
//        Filter newFilter = new Filter();
//        Stream res = newFilter.filter(products, new ColorSpecification(Color.GREEN));
//
//        res.forEach(obj -> System.out.println(((Product)obj).name));
    }

    private static void ocpViolatedApproach(List<Product> products) {
        ProductFilter productFilter = new ProductFilter();
        System.out.println("Green Products (old): ");
        productFilter.filterByColor(products, Color.GREEN)
                .forEach(product -> System.out.print(product.name  + " "));
        System.out.println();
        productFilter.filterByColorAndSize(products, Color.BLUE, Size.HUGE);
        System.out.println();
    }

    private static void ocpApproach(List<Product> products) {
        Filter<Product> newProductFilter = new NewProductFilter();
        System.out.println("Green Products (new): ");
        newProductFilter.filter(products, new ColorSpecification(Color.GREEN))
                .forEach(product -> System.out.println (product.name + " "));

        newProductFilter.filter(products,
                List.of(new ColorSpecification(Color.GREEN), new PriceRangeSpecification(10000, 1000000000)))
                .forEach(product -> System.out.println(product.name + " is: " + product.color + " and costs" + product.price));
    }
}
