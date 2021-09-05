package design.patterns.behavioral.command.receiver;
/**
 * @author nayanava
 */

import java.io.*;

public class TextFileReceiver {
    private String filename;
    public TextFileReceiver(String name){
        filename = name;
    }

    public String open() {
        return "Opening file " + filename;
    }

    public String save() {
        return "Saving file " + filename;
    }
}
