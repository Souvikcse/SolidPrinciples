package design.patterns.creational.singleton;
/**
 * @author nayanava
 */

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
