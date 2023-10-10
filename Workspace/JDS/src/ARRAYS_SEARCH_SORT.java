import java.util.Scanner;
import java.util.Arrays;

public class ARRAYS_SEARCH_SORT {

	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String args[])	{

		
		String[] myClientsArray = new String[8];
		myClientsArray[0] = "Butler";
		myClientsArray[1] = "Samuels";
		myClientsArray[2] = "Bond";
		myClientsArray[3] = "Chang";
		myClientsArray[4] = "Baker";
		myClientsArray[5] = "Davis";
		myClientsArray[6] = "Zheng";
		myClientsArray[7] = "Joe";
		
		int[] myClientNumbers = new int[8];
		myClientNumbers[0] = 108;
		myClientNumbers[1] = 121;
		myClientNumbers[2] = 188;
		myClientNumbers[3] = 107;
		myClientNumbers[4] = 122;
		myClientNumbers[5] = 111;
		myClientNumbers[6] = 203;
		myClientNumbers[7] = 135;
				
		String searchStr;
		int searchInt;
		char change = '\0';
		char change2 = '\0';
		int changeInt;
		
		System.out.println("\nEnter a client name to search:");
		searchStr = sc.next();
		linSearchString(myClientsArray, myClientNumbers, searchStr);
		
		System.out.println("\nEnter a number to search:");
		searchInt = sc.nextInt();
		linSearchInt(myClientsArray, myClientNumbers, searchInt);
		
		System.out.println("\nWould you like to change a client name? ( Y or N )?");	
		change = sc.next().charAt(0);
		
		if (change == 'Y') {
			System.out.println("\nEnter the position of the name you would like to change ");	
			changeInt = sc.nextInt();
			System.out.println("\nEnter what you would like the new name to be ");
			myClientsArray[changeInt - 1] =  sc.next();
			System.out.println("\nNew client name at position " + changeInt + " is " + myClientsArray[changeInt - 1] );
		}
		
		System.out.println("\nWould you like to change a client number? ( Y or N )?");	
		change = sc.next().charAt(0);
		
		if (change == 'Y') {
				System.out.println("\nEnter the position of the number you would like to change ");	
				changeInt = sc.nextInt();
				System.out.println("\nEnter what you would like the new number to be ");
				myClientNumbers[changeInt - 1] =  sc.nextInt();
				System.out.println("\nNew client number at position " + changeInt + " is " + myClientNumbers[changeInt - 1] );				
		}	
		
		System.out.println("\nCorresponding client names and numbers: ");
		for( int i = 0; i < (myClientsArray.length); i++ ) {
			System.out.println( myClientsArray[i] + "	" + myClientNumbers[i] );
		}

		
		String[] myClientsArray2 = myClientsArray; 
		int[] myClientNumbers2 = myClientNumbers;
		
		Arrays.sort(myClientsArray2);
		Arrays.sort(myClientNumbers2);
		
		System.out.println("\nSorted client names: ");

		for( int i = 0; i < (myClientsArray2.length); i++ ) {
			System.out.println( myClientsArray2[i] );
		}
		
		System.out.println("\nSorted client numbers: ");

		for( int i = 0; i < (myClientNumbers2.length); i++ ) {
			System.out.println( myClientNumbers2[i] );
		}
	
	
	}
	public static void linSearchString(String strArray[], int intArray[], String search)
	{
		
		int i = 0;
		int flag = 0;
		for(i = 0; i < 8; i++)
		{
			if (search.equals(strArray[i]))
			{
				flag = 1;
				break;
			}
		}
		if (flag == 1) {
			System.out.println("\nName found at position " + ( i + 1));
			System.out.println("Corresponding client number is " + intArray[ i ]);

		}
		else
			System.out.println("\nName not found");
	}
	
	public static void linSearchInt(String strArray[], int intArray[], int search)
	{
		int i = 0;
		int flag = 0;
		for(i = 0; i < 8; i++)
		{
			if (search == (intArray[i]))
			{
				flag = 1;
				break;
			}
		}
		if (flag == 1)
			System.out.println("\nNumber found at position " + ( i + 1));
		else
			System.out.println("\nNumber not found");
	}

}
