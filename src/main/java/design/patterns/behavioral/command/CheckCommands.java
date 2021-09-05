package design.patterns.behavioral.command;

import design.patterns.behavioral.command.command.TextFileOpCommand;
import design.patterns.behavioral.command.command.impl.OpenTextFileOpCommand;
import design.patterns.behavioral.command.command.impl.SaveTextFileOpCommand;
import design.patterns.behavioral.command.invoker.TextFileOpInvoker;
import design.patterns.behavioral.command.receiver.TextFileReceiver;

public class CheckCommands {
    public static void main(String[] args) {
        TextFileReceiver file = new TextFileReceiver("file1.txt");

        // This can be abstracted out
        TextFileOpCommand<String> cmd = new OpenTextFileOpCommand(file);

        TextFileOpInvoker invoker = new TextFileOpInvoker();
        System.out.println(invoker.executeOperation(cmd));

        //-------------------

        cmd = new SaveTextFileOpCommand(file);

        invoker = new TextFileOpInvoker();
        System.out.println(invoker.executeOperation(cmd));
    }
}
