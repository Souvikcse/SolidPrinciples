package solid.ocp;
/**
 * @author nayanava
 */

public class PriceRangeSpecification implements ISpecification<Product> {
    private double minPrice;
    private double maxPrice;

    public PriceRangeSpecification(double minPrice, double maxPrice) {
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
    }

    @Override
    public boolean isSatisfiedBy(Product item) {
        return item.price >= this.minPrice && item.price <= this.maxPrice;
    }
}
