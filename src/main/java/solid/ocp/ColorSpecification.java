package solid.ocp;
/**
 * @author nayanava
 */

public class ColorSpecification implements ISpecification<Product>{

    private Color color;
    public ColorSpecification(Color color) {
        this.color = color;
    }

    @Override
    public boolean isSatisfiedBy(Product item) {
        return item.color == this.color;
    }
}
