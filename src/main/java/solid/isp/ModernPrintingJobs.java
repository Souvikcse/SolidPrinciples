package solid.isp;
/**
 * @author nayanava
 */

import java.io.*;

public interface ModernPrintingJobs extends PrintingMachine {
    void photocopy(String content);
    void duplexContent(String content);
    void threeDPrinting(String content);
}
