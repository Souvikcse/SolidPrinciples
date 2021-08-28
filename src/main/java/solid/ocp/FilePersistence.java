package solid.ocp;
/**
 * @author nayanava
 */

import java.io.*;

public class FilePersistence implements Persistence{
    String fileName;
    public FilePersistence(String fileName) {
        this.fileName = fileName;
    }
    public void save(Product product, String filename) {
        try (PrintStream out = new PrintStream(filename)){
            out.println(product);
        } catch (FileNotFoundException fe) {
            Log.error(fe.getMessage(), fe);
        }
    }

    public void save(Product product) {
        try (PrintStream out = new PrintStream(this.fileName)){
            out.println(product);
        } catch (FileNotFoundException fe) {
            Log.error(fe.getMessage(), fe);
        }
    }
}
