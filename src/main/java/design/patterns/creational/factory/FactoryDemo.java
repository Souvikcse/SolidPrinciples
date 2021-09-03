package design.patterns.creational.factory;
/**
 * @author nayanava
 */

//high level module which delegates some task to a low level module
public class FactoryDemo {
    public static void main(String[] args) {
        //this approach is introducing coupling

    }

    private void saveData(String type) {
        Persistence<Object> persistence = PersistenceFactory.getInstance(type);
        persistence.save(new Object());
    }
}
