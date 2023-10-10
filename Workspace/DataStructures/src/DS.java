import java.util.Scanner;
import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.NumberFormat;

public class DS {
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		
		String myFile = "C:\\Users\\Naya\\AppData\\Local\\Temp\\data.txt";
		FileWriter file = new FileWriter(myFile);
		PrintWriter outfile = new PrintWriter(file);
		
		// variable for the number of records in the data table
		int numRecords = 0;
		
		// variables for the fields of the data table
		String strName = "";
		double dblCost = 0;
		int intQuantity = 0;
		char chrLocation = '\0';
		int ExpItems = 0;
		int ItemsinB = 0;
		double TotalItemsinB = 0;
		double cheap = Integer.MAX_VALUE;
		String cheapItm = "null";
		
		
		// input the number of records to be processed
		System.out.println("How many records are for processing?");
		numRecords = sc.nextInt();
		for (int i = 1; i <= numRecords; i++){
			// obtain user input
			System.out.println("item description");
			sc.nextLine();
			strName = sc.next();
			System.out.println("item cost");
			sc.nextLine();
			dblCost = sc.nextDouble();
			System.out.println("item quantity");
			sc.nextLine();
			intQuantity  = sc.nextInt();
			System.out.println("item location");
			sc.nextLine();
			chrLocation = sc.next().charAt(0);
			outfile.print(strName + ","); 
			outfile.print(dblCost + ",");
			outfile.print(intQuantity + ",");
			outfile.println(chrLocation);
		}
		sc.close();
		outfile.close();
		
		String dataFile = "C:\\Users\\Naya\\AppData\\Local\\Temp\\data.txt";
		String line = "";
		String csv = ",";
		FileReader fileIn = new FileReader(dataFile);
		BufferedReader br = new BufferedReader(fileIn);
		try {
			while ((line = br.readLine()) != null) {
			  // use comma as a value separator
			  String[] data = line.split(csv);
			  if ( Double.parseDouble(data[1]) > 100.00) {
				  ExpItems++;
			  }
			  if(data[3].equals("B")) {
				  TotalItemsinB += Double.parseDouble(data[2]);
				  ItemsinB++;
			  }
			  if(Double.parseDouble(data[1]) < cheap) {
				  cheap = Double.parseDouble(data[1]);
				  cheapItm = data[0];
			  }
			  
			  System.out.println(data[0] + "," + nf.format(Double.parseDouble(data[1])) + "," + 
			     data[2] + "," + data[3]);
			}
		}catch (IOException e){
			e.printStackTrace();
		}
		br.close();
		System.out.println("There are " + ExpItems + " unique items priced over $100.00.");
		System.out.println("There are " + ItemsinB + " unique items stored in location B.");
		System.out.println("There are " + TotalItemsinB + " total items stored in location B.");
		System.out.println("The cheapest unique item is the " + cheapItm + ".");
		System.out.println("The cheapest unique item is priced at " + nf.format(cheap) + ".");

	}

}
