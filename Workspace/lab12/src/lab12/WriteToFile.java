package lab12;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
	private static final String FILENAME = "C:\\All\\Eclipse\\Files\\Data.txt";

	public static void main(String[] args) {
		BufferedWriter bw = null;
		FileWriter fw = null;
		try {
			String field1 = "101,Yes,02/10/2021,32.73,.00,2.00,";
			String field2 = "102,No,02/10/2021,19.07,.00,0.00,";
			String field3 = "101,Yes,02/11/2021,97.21,10.00,1.00,";
			String field4 = "102,No,02/12/2021,118.67,15.00,3.00,";
			String field5 = "104,Yes,02/12/2021,123.47,3.00,8.00,";
			String field6 = "104,Yes,02/12/2021,52.30,.50,2.00";
			String field7 = "101,Yes,02/12/2021,12.47,5.00,5.00";
			String field8 = "103,No,02/13/2021,19.08,.50,7.00";
			String field9 = "103,No,02/13/2021,27.91,5.00,0.50";
			String field10 = "105,Yes,02/13/2021,10.04,1.00,2.50";
			fw = new FileWriter(FILENAME, true);
			bw = new BufferedWriter(fw);
			bw.write(field1 + "\n");
			bw.write(field2 + "\n");
			bw.write(field3 + "\n");
			bw.write(field4 + "\n");
			bw.write(field5 + "\n");
			bw.write(field6 + "\n");
			bw.write(field7 + "\n");
			bw.write(field8 + "\n");
			bw.write(field9 + "\n");
			bw.write(field10 + "\n");
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
