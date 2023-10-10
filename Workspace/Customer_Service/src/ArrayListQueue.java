import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class ArrayListQueue {
	// declare an array list
	static ArrayList<String> list = new ArrayList<String>();
	static ArrayList<String> unlist = new ArrayList<String>();

	public static void main(String args[]) {
		// declare a Date object and its formatting
		boolean i = true;
		char use = '\0';
		int CustomersServed = 0;
		Scanner scan = new Scanner(System.in);
		Date myDate = new Date();
		String myDateFormat = "MM/dd/yyyy";
		SimpleDateFormat dtToday = new SimpleDateFormat(myDateFormat);
		// populate the list with some initial elements (queue)

		// declare a StringBuilder object to display the list elements
		StringBuilder sb = new StringBuilder();
		// declare an Iterator object to cycle through the list element
		// use a looping structure to display the list elements
		System.out.println("iterate through ArrayList elements ...");

		// display the elements that are in the list (queue)
		JOptionPane.showMessageDialog(null, dtToday.format(myDate) + "\n" + "display queue \n" + sb);
		while (i) {
			System.out.println("Please specify what operation you would like to execute");
			System.out.println("Input A to add a customer to the queue");
			System.out.println("Input P to process a customer from the queue");
			use = scan.next().charAt(0);
			if (use == 'A') {
				System.out.println("Please specify the name of the customer you would like to add");
				enqueue(scan.next());

				StringBuilder sbr = new StringBuilder();
				Iterator<String> itr = list.iterator();

				while (itr.hasNext()) {
					// append the elements to the StringBuilder object
					sbr.append(itr.next() + "\n");
				}

				JOptionPane.showMessageDialog(null, dtToday.format(myDate) + "\n" + "display queue \n" + "\n"
						+ "A new patron has been added to the queue" + "\n" + sbr);
			} else if (use == 'P') {
				if (!list.isEmpty()) {
					String de = list.get(0);
					unlist.add(de);
					dequeue();

					StringBuilder sbr = new StringBuilder();
					Iterator<String> itr = list.iterator();

					while (itr.hasNext()) {
						// append the elements to the StringBuilder object
						sbr.append(itr.next() + "\n");
					}

					JOptionPane.showMessageDialog(null, dtToday.format(myDate) + "\n" + "display queue \n" + "\n" + de
							+ " is being processed by customer service" + "\n" + sbr);
				} else {
					JOptionPane.showMessageDialog(null,
							dtToday.format(myDate) + "\n" + "display queue \n" + "\n" + "The queue is empty" + "\n");
				}
			}
		}
	}

	public static void enqueue(String str) {
		list.add(str);

	}

	public static void dequeue() {
		if (!list.isEmpty()) {
			list.remove(0);
		}

	}

	public static boolean isEmpty() {
		if (list.isEmpty()) {
			return true;
		}
		return false;

	}

	public static void custCount() {

		System.out.println(unlist.size());

	}
}