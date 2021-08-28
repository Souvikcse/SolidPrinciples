package solid.srp;
/**
 * @author nayanava
 */

import java.io.*;

public class Log {
    public static void error(Exception e, String message) {
        System.out.println(message + " " + e);
    }

    public static void info(String message) {
        System.out.println(message);
    }
}
