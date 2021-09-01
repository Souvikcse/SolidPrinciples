package design.patterns.factory;
/**
 * @author nayanava
 */

import design.patterns.factory.impl.CachePersistence;
import design.patterns.factory.impl.DbPersistence;
import design.patterns.factory.impl.FilePersistence;
import solid.ocp.Log;

import java.io.*;

public class PersistenceFactory {
    public static Persistence getInstance(String type) {
        switch (type) {
            case "File":
                return new FilePersistence();
            case "Cache":
                return new CachePersistence();
            case "Database":
                return new DbPersistence();
            default:
                Log.error("Invalid instance type");
                throw new IllegalArgumentException(String.format("invalid type: %s", type));
        }
    }
}
