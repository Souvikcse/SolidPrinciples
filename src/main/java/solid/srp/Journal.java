package solid.srp;

import java.awt.image.AreaAveragingScaleFilter;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Journal {
	private final List<String> entries = new ArrayList<>();
	private static int count = 0;

	public void addEntry(String text) {
		entries.add("" + (++count) + ": " + text);
	}

	public void removeEntry(int index) {
		entries.remove(index);
	}

	public void loadJournal(String filename) {
	}

	private void  loadJournal(URL url) {

	}

	@Override
	public String toString() {
		return String.join("\n", entries);
	}
}