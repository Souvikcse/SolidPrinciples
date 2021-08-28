package solid.ocp;

import java.util.List;
import java.util.stream.Stream;

/**
 * @author nayanava
 */
public interface Filter<T> {

    Stream<T> filter(List<T> items, ISpecification<T> spec);
    Stream<T> filter(List<T> items, List<ISpecification<T>> specs);
}
