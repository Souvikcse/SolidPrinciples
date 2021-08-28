package solid.srp;

/**
 * @author nayanava
 */
public interface IPersistence {
    void saveJournal(String filename, Journal journal);
}
