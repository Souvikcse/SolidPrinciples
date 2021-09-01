package design.patterns.factory;
/**
 * @author nayanava
 */

import design.patterns.factory.impl.DbPersistence;
import design.patterns.factory.impl.FilePersistence;

import java.io.*;

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
