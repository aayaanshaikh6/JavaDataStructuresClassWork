package lab13;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.HashSet;
import java.util.List;

public class NameAnalyzer {
	public static void main(String args[]) {
		//variables
		List<String> names = new ArrayList<String>();
		int TotalDups = 0;
		


		//reading data
		File file = new File("C:\\All\\Eclipse\\Files\\names.dat");
		Scanner scan = null;
		try {
			scan = new Scanner(file);
			while (scan.hasNextLine()) {
				String line = scan.nextLine();
				names.add(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			scan.close();
		}
		List<String> noDupsList = new ArrayList<>(new HashSet<>(names));
		Collections.sort(noDupsList);
		for (String name : noDupsList) {
			System.out.println(name + " ");
		}
		System.out.println(names.size() - noDupsList.size() + " total dublicates.");
		List<String> AllNames = names;
		for (String name : noDupsList) {
			int dups = -1;
			while(AllNames.contains(name)) {
				AllNames.remove(name);
				dups++;
			}
			System.out.println(name + " has " + dups + " duplicates.");
		}
	}
}