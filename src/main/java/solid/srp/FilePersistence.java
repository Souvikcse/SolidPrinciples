package solid.srp;
/**
 * @author nayanava
 */

import java.io.*;

public class FilePersistence implements IPersistence {

    @Override
    public void saveJournal(String filename, Journal journal) {
        try (PrintStream out = new PrintStream(filename)){
            out.println(journal);
        } catch (FileNotFoundException e) {
            Log.error(e, e.getMessage());
        }
    }
}
