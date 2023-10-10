import java.util.Random;
import java.util.Scanner;

public class SeizeTheStation{
	
	public static void main(String args[])	{
		System.out.println(1E-5 * 100000);
		// declare a Scanner class object and Random class object
		Scanner scan = new Scanner(System.in);
		Random randomGen = new Random();
		// variable to decrease distance to target
		int randAddDist = 300;
		// variable to track remaining distance to target
		int randDistToMove = 0;
		// variable to use to supplement player / game interaction
		int randInteract = 0;
		// variable to define player obstacle
		char interact = '\0';
		// variable to allow player to proceed to target
		char again = '\0';
		// variable to set initial distance to goal
		int goal = 300;
		// variable to set initial player health
		int health = 100;
		// define a loop for at most twenty actions
		int obstacle;
		int obstacleDmg;
		int obstacleRwd;
		int cow = 1;
		String name;
		char cowB = '\0';
		int cowNum = 0;
		
		for (int count = 1; count <= 200; count++){
			// signal the intention of the player
			cowNum ++;
			System.out.println("\n-----------------------------------");
			System.out.println("\nYou have " + health + " health remaining.");
			System.out.println("\nYou are " + randAddDist + " feet away from your goal.");
			System.out.println("\nAre you ready to proceed? ( Y or N )?");
			again = scan.next().charAt(0);
			
			if (again != 'Y') {
				System.out.println("\nGAME OVER, YOU QUIT.");
				break;
			}
			if(cowNum == 5) {
				if((randomGen.nextInt(2) == 1)) {
					System.out.println("\nA cowboy wants to join your party.");
					System.out.println("\nAccepting the cowboy will double both your traveling speed and damage taken.");
					System.out.println("\nA to accept or D to decline.");
					cowB = scan.next().charAt(0);
					if(cowB == 'A') {
						cow += 2;
					}	
				}
				cowNum = 0;
			}

			// define an obstacle
			obstacle = randomGen.nextInt(3);
			if(obstacle == 0) {
				System.out.println("\nYou face a boulder.");
				obstacleDmg = 1;
				obstacleRwd = 1;
				name = "boulder";
			}else if(obstacle == 1) {
				System.out.println("\nYou face a river.");
				obstacleDmg = 2;
				obstacleRwd = 2;
				name = "river";
			}else {
				System.out.println("\nYou face bandits.");
				obstacleDmg = 3;
				obstacleRwd = 3;
				name = "bandits";
			}
			
			interact = (char) (randomGen.nextInt(26) + 'a');

			if (interact >= 'a' && interact <= 'm'){
				System.out.println("\nYou overcome the " + name +"!!!");
				// random number sets distance to move toward the objective
				randDistToMove = cow * obstacleRwd * (1 + randomGen.nextInt(30));
				randAddDist -= randDistToMove;
				System.out.println("\nYou move forward " + randDistToMove + " ft.");
			}
			else{
				health -= cow * obstacleDmg * 6;
				System.out.println("\nYou lost " + cow * obstacleDmg * 6 + " health trying to circumvent the " + name + "!!!");
				
			}
			if(health <= 0) {
				System.out.println("\nGAME OVER, YOU DIED.");
				break;
			}
			if(randAddDist <= 0) {
				System.out.println("\nYOU HAVE REACHED YOUR GOAL, YOU WIN!!!");
				System.out.println("\nIt took you " + count + " loops to win.");
				System.out.println("\nYou won with " + health + " health left.");
				break;
			}
		}
	}
}