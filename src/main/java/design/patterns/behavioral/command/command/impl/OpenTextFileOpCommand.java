package design.patterns.behavioral.command.command.impl;
/**
 * @author nayanava
 */

import design.patterns.behavioral.command.command.TextFileOpCommand;
import design.patterns.behavioral.command.receiver.TextFileReceiver;

import java.io.*;

public class OpenTextFileOpCommand implements TextFileOpCommand<String> {

    private TextFileReceiver textFileReceiver;

    public OpenTextFileOpCommand(TextFileReceiver textFileReceiver) {
        this.textFileReceiver = textFileReceiver;
    }

    @Override
    public String execute() {
        return textFileReceiver.open();
    }
}
