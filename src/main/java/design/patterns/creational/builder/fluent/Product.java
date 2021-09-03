package design.patterns.creational.builder.fluent;
/**
 * @author nayanava
 */

public class Product {
    //mandatory
    private String productName;
    //mandatory
    private String manufacturingDate;
    //mandatory
    private String modelNumber;
    //optional
    private String description;
    //optional
    private String size;
    //optional
    private String color;

    public Product(String productName,
                   String manufacturingDate,
                   String modelNumber,
                   String description,
                   String size,
                   String color) {
        this.productName = productName;
        this.manufacturingDate = manufacturingDate;
        this.modelNumber = modelNumber;
        this.description = description;
        this.size = size;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", manufacturingDate=" + manufacturingDate +
                ", modelNumber='" + modelNumber + '\'' +
                ", description='" + description + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    interface ProductName {
        ManufacturingDate productName(String productName);
    }

    interface ManufacturingDate {
        ModelNumber manufacturingDate(String mfgDate);
    }

    interface ModelNumber {
        OptionalProductAttributes modelNumber(String modelNumber);
    }

    interface OptionalProductAttributes {
        OptionalProductAttributes description (String description);
        OptionalProductAttributes size (String size);
        OptionalProductAttributes color (String color);
        Product build();
    }

    public static class ProductBuilder implements ProductName,
            ManufacturingDate,
            ModelNumber,
            OptionalProductAttributes {

        private String productName;
        private String manufacturingDate;
        private String modelNumber;
        private String description;
        private String size;
        private String color;

        private ProductBuilder() {

        }

        public static ProductName getInstance() {
            return new ProductBuilder();
        }
        @Override
        public ManufacturingDate productName(String productName) {
            this.productName = productName;
            return this;
        }

        @Override
        public ModelNumber manufacturingDate(String mfgDate) {
            this.manufacturingDate = mfgDate;
            return this;
        }

        @Override
        public OptionalProductAttributes modelNumber(String modelNumber) {
            this.modelNumber = modelNumber;
            return this;
        }

        @Override
        public OptionalProductAttributes description(String description) {
            this.description = description;
            return this;
        }

        @Override
        public OptionalProductAttributes size(String size) {
            this.size = size;
            return this;
        }

        @Override
        public OptionalProductAttributes color(String color) {
            this.color = color;
            return this;
        }

        @Override
        public Product build() {
            return new Product(productName, manufacturingDate, modelNumber, description, size, color);
        }
    }
}
