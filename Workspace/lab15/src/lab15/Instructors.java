package lab15;

public class Instructors {
	
	int Classbudget;
	String loc;
	String lvl;
	String[] mats;
	
	public Instructors(int budget, String location, String knowledgeLvl, String[] teachingMaterials ) {
		Classbudget = budget;
		loc = location;
		lvl = knowledgeLvl;
		mats = teachingMaterials;
	}
}
