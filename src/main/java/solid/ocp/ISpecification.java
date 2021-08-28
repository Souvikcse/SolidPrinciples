package solid.ocp;

/**
 * @author nayanava
 */
public interface ISpecification<T> {
    boolean isSatisfiedBy(T item);
}
