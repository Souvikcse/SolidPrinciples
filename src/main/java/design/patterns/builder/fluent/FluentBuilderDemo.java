package design.patterns.builder.fluent;
/**
 * @author nayanava
 */

public class FluentBuilderDemo {
    public static void main(String[] args) {
        Product product = Product.ProductBuilder
                .getInstance()
                .productName("apple iphone 12")
                .manufacturingDate("31-08-2021")
                .modelNumber("iphone 12")
         //       .color("Red")
                .size("20")
                .build();
        System.out.println(product);
    }
}
