package solid.ocp;
/**
 * @author nayanava
 */

import java.io.*;

public class Log {
    public static void error(String message, Exception e) {
        System.out.println(message + " " + e);
    }
    public static void info(String message) {
        System.out.println(message);
    }
}
