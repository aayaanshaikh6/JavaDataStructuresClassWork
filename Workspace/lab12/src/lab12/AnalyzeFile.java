package lab12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.lang.Double;

public class AnalyzeFile {
	public static void main(String args[]) {
		//variables
		ArrayList<String> NonMembers = new ArrayList<String>();
		int NumRecords = 0;
		double TotalRewards = 0.00;
		double TotalPurchases = 0.00;
		double RatioRewardToTotalPurchase;
		String RangeOfDates;
		String StrLatestDate = "00/00/0000";
		String StrEarliestDate = "12/31/2100";
		Date LatestDate = new Date();
		Date EarliestDate = new Date();
		SimpleDateFormat late =  null;
		SimpleDateFormat early =  null;
		NumberFormat nf = NumberFormat.getCurrencyInstance();

		
		try {
			LatestDate = new SimpleDateFormat("MM/dd/yyyy").parse(StrLatestDate);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			EarliestDate = new SimpleDateFormat("MM/dd/yyyy").parse(StrEarliestDate);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		//reading data
		File file = new File("C:\\All\\Eclipse\\Files\\Data.txt");
		Scanner scan = null;
		try {
			scan = new Scanner(file);
			while (scan.hasNextLine()) {
				NumRecords ++;
				String line = scan.nextLine();
				String[] arr = line.split(",");

				if (arr[1].equals("Yes")) {
					if (!NonMembers.contains(arr[0])) {
						NonMembers.add(arr[0]);
					}
				}

				TotalRewards += Double.parseDouble(arr[5]);

				TotalPurchases += Double.parseDouble(arr[3]);

				Date date = new SimpleDateFormat("MM/dd/yyyy").parse(arr[2]);
				if(date.before(EarliestDate)) {
					EarliestDate = date;
					early = new SimpleDateFormat(arr[2]);
				}
				if(date.after(LatestDate)) {
					LatestDate = date;
					late = new SimpleDateFormat(arr[2]);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			scan.close();
		}
		RangeOfDates = String.valueOf(TimeUnit.DAYS.convert((EarliestDate.getTime() - LatestDate.getTime()),TimeUnit.MILLISECONDS));
		RatioRewardToTotalPurchase = TotalRewards / TotalPurchases;
		System.out.println("There are a total of " + NumRecords + " records in the data file.");
		System.out.println("A total of " + nf.format(TotalRewards) + " of Reward Cash was issued.");
		System.out.println("For every dollar of goods purchased " + nf.format(RatioRewardToTotalPurchase) + " of Reward Cash was issued.");
		System.out.println("An average of " + nf.format(TotalRewards/NumRecords) + " of Reward Cash was issued per purchase.");
		System.out.println("Customers " + NonMembers + " are not members of the Reward Program.");
		System.out.println("This data file contains purchases from " + early.format(EarliestDate.getTime()) + " to " + late.format(LatestDate.getTime()));
		System.out.println("This data file contains purchases over " + Math.abs(Integer.parseInt(RangeOfDates)) + " days.");
		
	}
}