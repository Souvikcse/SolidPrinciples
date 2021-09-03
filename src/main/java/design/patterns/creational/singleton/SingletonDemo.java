package design.patterns.creational.singleton;
/**
 * @author nayanava
 */

public class SingletonDemo {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        Singleton s1 = Singleton.getInstance();

        System.out.println(s == s1);
    }
}
