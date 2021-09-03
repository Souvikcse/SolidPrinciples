package design.patterns.behavioral.command.command.impl;
/**
 * @author nayanava
 */

import design.patterns.behavioral.command.command.TextFileOpCommand;
import design.patterns.behavioral.command.receiver.TextFileReceiver;

public class SaveTextFileOpCommand implements TextFileOpCommand<String> {
    private TextFileReceiver textFileReceiver;

    public SaveTextFileOpCommand(TextFileReceiver textFileReceiver) {
        this.textFileReceiver = textFileReceiver;
    }

    @Override
    public String execute() {
        return textFileReceiver.save();
    }
}
