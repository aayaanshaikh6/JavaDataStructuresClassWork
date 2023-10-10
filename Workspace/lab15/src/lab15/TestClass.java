package lab15;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestClass {
	
	public static String[] locations = {"North","South","East","West"};
	public static String[] knowledgeLvl = {"Beginner","Intermediate","Advanced"};
	public static String[] teachingMaterials = {"Texts","Computers","Software"};
	public static List<String> names = Arrays.asList("name1", "name2", "name3", "name4", "name5", "name6", "name7", "name8"); 
	
	
	public static void main(String[] args) {
		
		names.add(9, "Albert");
		System.out.println(names);
		/*
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		
		Instructors instructor = new Instructors(2000, locations[0] + " and " + locations[1],knowledgeLvl[0], teachingMaterials);
		Spartans spartan = new Spartans(4000, locations[2],knowledgeLvl[2], teachingMaterials);
		Athenians athenian = new Athenians(3000, locations[3],knowledgeLvl[1], teachingMaterials);
		
		System.out.println("The total Cumberland Training Services teaching budget is " + nf.format(instructor.Classbudget + spartan.Classbudget + athenian.Classbudget) + ".\n");
		
		System.out.println("The Standard instructors budget is " + nf.format(instructor.Classbudget) +".");
		System.out.println("The Athenian instructors budget is " + nf.format(athenian.Classbudget) +".");
		System.out.println("The Spartan instructors budget is " + nf.format(spartan.Classbudget) +".\n");
		
		System.out.println("The Standard instructors teach in the " + instructor.loc + " locations.");
		System.out.println("The Athenian instructors teach in the " + athenian.loc + " location.");
		System.out.println("The Spartan instructors teach in the " + spartan.loc + " location.\n");
		
		System.out.println("The Standard instructors teach at a " + instructor.lvl + " level.");
		System.out.println("The Athenian instructors teach at an " + athenian.lvl + " level.");
		System.out.println("The Spartan instructors teach at an " + spartan.lvl + " level.\n");
		
		System.out.println("The teaching materials for all instuctors are " + instructor.mats[0] + " and " + instructor.mats[1] + " and " + instructor.mats[2] + ".");
		*/
	}
}