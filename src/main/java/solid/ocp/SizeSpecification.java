package solid.ocp;
/**
 * @author nayanava
 */

public class SizeSpecification implements ISpecification<Product> {

    private Size size;

    public SizeSpecification(Size size) {
        this.size = size;
    }
    @Override
    public boolean isSatisfiedBy(Product item) {
        return item.size == size;
    }
}
