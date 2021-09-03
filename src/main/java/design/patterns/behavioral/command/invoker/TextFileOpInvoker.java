package design.patterns.behavioral.command.invoker;
/**
 * @author nayanava
 */

import design.patterns.behavioral.command.command.TextFileOpCommand;

import java.io.*;

public class TextFileOpInvoker {
    public String executeOperation(TextFileOpCommand textFileOpCommand) {
        return (String) textFileOpCommand.execute();
    }
}
