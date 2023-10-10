/*
Program calculates the approximate square root
of a number using Newton’s method
Programmer:  File Name: Newton.java
 */
// packages for number formatting & scanner objects
import java.text.DecimalFormat;
import java.util.Scanner;
public class Newton {

	// post condition return not a number if input is negative
	public static float Compute(float num) {
		if (num < 0) {
			return Float.NaN;
		}
		// define variable sqrRoot to hold the approximate square root  
		float sqrRoot = num / 2f;
		//set it equal to num/2 for iteration 0
		// define a small sentinel value (relative error tolerance)
		double precision = 1E-5f;
		//loop as long as the root is within our sentinel value
		// use absolute value so to approximate a high guess and low guess
		while (Math.abs(sqrRoot - num / sqrRoot) > precision * 
				sqrRoot) {
			// square root approximation formula
			sqrRoot = (float) ((num / sqrRoot + sqrRoot) / 2.0);
		} // loop end
		// return sqrRoot solution 
		return sqrRoot;
	}
	public static void main(String[] args) {
		// declare a Scanner object
		Scanner sc = new Scanner(System.in);
		// declare a DecimalFormat object
		DecimalFormat fourDecimal = new DecimalFormat("0.0000");
		// declare the variable used to store the user’s number
		float Number = 0;
		// prompt for user input
		System.out.println("Find the square roots by Newton’s Method");
		System.out.print("Please enter a number: ");
		// read the next float 
		Number = sc.nextFloat();
		// close scanner object  
		sc.close();
		// print out the approximated square root
		System.out.println("Square root of " + Number + " is "
				+ fourDecimal.format(Compute(Number)));
	}
}