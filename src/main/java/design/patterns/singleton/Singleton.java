package design.patterns.singleton;
/**
 * @author nayanava
 */

import java.io.*;

public class Singleton {
    private Singleton() {
    }
    private static volatile Singleton INSTANCE = null;

    public static Singleton getInstance() {
        if( INSTANCE == null) {
            synchronized (INSTANCE) {
                if(INSTANCE == null)
                    INSTANCE = new Singleton();
            }
        }
        return INSTANCE;
    }
}
