package lab13;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class NameGenerator {
	private static final String FILENAME = "C:\\All\\Eclipse\\Files\\names.dat";
	
	public static void main(String[] args) {
		BufferedWriter bw = null;
		FileWriter fw = null;
		String[] peoples = { "Bob", "Carol", "Ted", "Alice", "Bruce", "Dick", "Jason", "Tim", "Damian", "Barbra", "Ace", "Cassandra", "Stephanie", "Luke"};
		List<String> names = Arrays.asList(peoples);
		Collections.shuffle(names);
		try {
			new FileWriter(FILENAME, false).close();
			fw = new FileWriter(FILENAME, true);
			bw = new BufferedWriter(fw);
			for (int i = 0; i < 10; i++) {
				Collections.shuffle(names);
				for (String name : names) {
					bw.write(name + "\n");
					System.out.print(name + " ");
				}
				System.out.print("\n");
			}
			System.out.println("data recorded!");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bw != null)
					bw.close();
				if (fw != null)
					fw.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
}