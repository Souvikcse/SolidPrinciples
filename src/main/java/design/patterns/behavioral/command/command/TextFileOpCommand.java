package design.patterns.behavioral.command.command;
/**
 * @author nayanava
 */

import java.io.*;

public interface TextFileOpCommand<T> {
    T execute();
}
