package design.patterns.singleton;
/**
 * @author nayanava
 */

import java.io.*;

public class SingletonDemo {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        Singleton s1 = Singleton.getInstance();

        System.out.println(s == s1);
    }
}
