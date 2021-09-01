package design.patterns.factory;

/**
 * @author nayanava
 */
public interface Persistence<T> {
    void save( T data);
    void fetch(String id);
    void update(T data);
    void delete(String id);
}
