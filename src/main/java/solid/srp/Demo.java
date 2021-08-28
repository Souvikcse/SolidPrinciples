package solid.srp;
/**
 * @author nayanava
 */

public class Demo {
    public static void main(String[] args) {
        Journal journal = new Journal();
        journal.addEntry("I attended the low level design class");
        journal.addEntry("I learnt about the solid principles");

        FilePersistence persistence = new FilePersistence();
        persistence.saveJournal("journal-26-08-2021", journal);
    }
}
