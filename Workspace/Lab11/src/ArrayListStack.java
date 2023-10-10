import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class ArrayListStack {
// declare a class – level array list
	static ArrayList<String> list = new ArrayList<String>();

	public static void main(String args[]) {
// declare a date object
		Date myDate = new Date();
		String myDateFormat = "MM/dd/yyyy";
		SimpleDateFormat dtToday = new SimpleDateFormat(myDateFormat);
//starter code
		/*
// add an element to the array list
		list.add("client 1");
// add an element to the array list
		list.add("client 2");
// add an element to the array list
		list.add("client 3");
// add an element to the array list
		list.add("client 4");
// reverse the list to create the stack
		Collections.reverse(list);
		*/
		push("client 1");
		push("client 2");
		push("client 3");
		push("client 4");
		
// store the stack elements in a StringBuilder object
		StringBuilder sb = new StringBuilder();
// declare an Iterator object
		Iterator<String> itr = list.iterator();
// iterate through the list of elements in the ArrayList
		System.out.println("iterate through ArrayList elements");
		while (itr.hasNext()) {
			sb.append(itr.next() + "\n");
		}
		// display the stack elements in a Dialog Box
		JOptionPane.showMessageDialog(null, dtToday.format(myDate) + "\n" + "display elements \n" + sb);
		// pop an element
		//pop();
		// pop an element
		pop();
		// clear the StringBuilder object
		sb.setLength(0);
		// update the Iterator object
		itr = list.iterator();
		// store the updated stack elements in a StringBuilder object
		System.out.println("iterate through ArrayList elements");
		while (itr.hasNext()) {
			sb.append(itr.next() + "\n");
		}
		// display the current stack elements in a Dialog Box
		JOptionPane.showMessageDialog(null, dtToday.format(myDate) + "\n" + "display elements \n" + sb);
		pop();
		// clear the StringBuilder object
		sb.setLength(0);
		// update the Iterator object
		itr = list.iterator();
		// store the updated stack elements in a StringBuilder object
		System.out.println("iterate through ArrayList elements");
		while (itr.hasNext()) {
			sb.append(itr.next() + "\n");
		}
		// display the current stack elements in a Dialog Box
		JOptionPane.showMessageDialog(null, dtToday.format(myDate) + "\n" + "display elements \n" + sb);
		push("client 5");
		// clear the StringBuilder object
		sb.setLength(0);
		// update the Iterator object
		itr = list.iterator();
		// store the updated stack elements in a StringBuilder object
		System.out.println("iterate through ArrayList elements");
		while (itr.hasNext()) {
			sb.append(itr.next() + "\n");
		}
		// display the current stack elements in a Dialog Box
		JOptionPane.showMessageDialog(null, dtToday.format(myDate) + "\n" + "display elements \n" + sb);
		push("client 6");
		// clear the StringBuilder object
		sb.setLength(0);
		// update the Iterator object
		itr = list.iterator();
		// store the updated stack elements in a StringBuilder object
		System.out.println("iterate through ArrayList elements");
		while (itr.hasNext()) {
			sb.append(itr.next() + "\n");
		}
		// display the current stack elements in a Dialog Box
		JOptionPane.showMessageDialog(null, dtToday.format(myDate) + "\n" + "display elements \n" + sb);
		pop();
		// clear the StringBuilder object
		sb.setLength(0);
		// update the Iterator object
		itr = list.iterator();
		// store the updated stack elements in a StringBuilder object
		System.out.println("iterate through ArrayList elements");
		while (itr.hasNext()) {
			sb.append(itr.next() + "\n");
		}
		// display the current stack elements in a Dialog Box
		JOptionPane.showMessageDialog(null, dtToday.format(myDate) + "\n" + "display elements \n" + sb);
		push("client 7");
		// clear the StringBuilder object
		sb.setLength(0);
		// update the Iterator object
		itr = list.iterator();
		// store the updated stack elements in a StringBuilder object
		System.out.println("iterate through ArrayList elements");
		while (itr.hasNext()) {
			sb.append(itr.next() + "\n");
		}
		// display the current stack elements in a Dialog Box
		JOptionPane.showMessageDialog(null, dtToday.format(myDate) + "\n" + "display elements \n" + sb);
		pop();
		// clear the StringBuilder object
		sb.setLength(0);
		// update the Iterator object
		itr = list.iterator();
		// store the updated stack elements in a StringBuilder object
		System.out.println("iterate through ArrayList elements");
		while (itr.hasNext()) {
			sb.append(itr.next() + "\n");
		}
		// display the current stack elements in a Dialog Box
		JOptionPane.showMessageDialog(null, dtToday.format(myDate) + "\n" + "display elements \n" + sb);
	}

	// define the pop() method
	public static void pop() {
		// declare an object to manipulate the list
		Object obj = new Object();
		if (list.size() > 0) {
			obj = list.remove(0);
			System.out.println(obj + " is removed from	ArrayList");
		} else
			System.out.println("empty list");
	}
	public static void top() {
		if (list.size() > 0) {
			System.out.println(list.get(0) + " is the top of ArrayList");
		} else
			System.out.println("empty list");
	}
	public static boolean isEmpty() {
		// declare an object to manipulate the list
		if (list.size() > 0) {
			return false;
		} else
			return true;
	}
	public static void push(String s) {
		if (list.size() > 0) {
				list.add(0, s);
		} else
			list.add(s);
	}
}
