package solid.ocp;
/**
 * @author nayanava
 */

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class NewProductFilter implements Filter<Product> {

    @Override
    public Stream<Product> filter(List<Product> items, ISpecification<Product> spec) {
        return items.stream().filter(item -> spec.isSatisfiedBy(item));
    }

    @Override
    public Stream<Product> filter(List<Product> items, List<ISpecification<Product>> specs) {
        List<Product> filteredItems = new LinkedList<>();
        for(Product item : items) {
            boolean failed = false;
            for(ISpecification spec : specs) {
                if(!spec.isSatisfiedBy(item)) {
                    failed = true;
                    break;
                }
            }
            if(!failed) {
                filteredItems.add(item);
            }
        }
        return filteredItems.stream();
    }
}
