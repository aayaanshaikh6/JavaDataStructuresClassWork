import java.util.ArrayList;
import java.util.*;

class BinPacking {
	int capacity;
	int itemsToPack[] = new int[100];
	int binNumber;
	int totalNumBins;

	public static void main(String args[]) {
		ArrayList<Integer> vect = new ArrayList<>();
		int pos = 0;
		int number = 0;
		int count = 1;
		int upperBound = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("how many items are to be packed? ");
		number = sc.nextInt();
		System.out.println("enter the bin capacity? ");
		upperBound = sc.nextInt();
		while (count <= number) {
			pos = getRandomValue(upperBound);
			vect.add(pos);
			count++;
		}
		/*
		 * vect.clear(); vect.add(1); vect.add(7); vect.add(12); vect.add(14);
		 * vect.add(5); vect.add(9); vect.add(12); vect.add(11); vect.add(7);
		 * vect.add(13); vect.add(1); vect.add(15); vect.add(4); vect.add(8);
		 * vect.add(6); vect.add(7); vect.add(11); vect.add(2); vect.add(1);
		 * vect.add(3);
		 */
		// test values

		System.out.println("-----------------------------");
		System.out.println("\nitems to pack: ");
		print(vect);

		System.out.println("First Fit: \n");
		FirstFit(vect, upperBound);
		NextFit(vect, upperBound);
	}

	public static int getRandomValue(int ub) {
		Random r = new Random();
		int element = 0;
		int upperBound = ub;
		int lowerBound = 1;
		element = Math.abs(r.nextInt()) % upperBound + lowerBound;
		return element;
	}

	public static void print(ArrayList<Integer> a) {
		for (int i = 0; i < a.size(); ++i)
			System.out.print(a.get(i) + " ");
		System.out.println("\n-----------------------------");
	}

	public static void FirstFit(ArrayList<Integer> a, int max) {
		ArrayList<Integer> bins = new ArrayList<>();
		ArrayList<Integer> binsCount = new ArrayList<>();
		int big = 0;

		for (int i = 0; i < a.size(); i++) {
			bins.add(0);
			binsCount.add(0);
		}
		for (int i = 0; i < bins.size(); i++) {
			for (int b = 0; b < bins.size(); b++) {
				if (a.get(i) <= (max - bins.get(b))) {
					bins.set(b, (bins.get(b) + a.get(i)));
					binsCount.set(b, (binsCount.get(b) + 1));
					if (b > big) {
						big = b;
					}
					System.out.println("Bin " + (b + 1) + ": " + bins.get(b));
					break;
				}
			}
		}
		System.out.print("Number of values in each bin:\n");
		for (int i = 0; i < binsCount.size(); i++) {
			if (bins.get(i) > 0) {
				System.out.print(binsCount.get(i) + " ");
			}
		}
		System.out.println("\nTotal number of bins used for First Fit is " + (big + 1) + ".");
		System.out.println("\n-----------------------------");
	}

	public static void NextFit(ArrayList<Integer> a, int max) {
		ArrayList<Integer> bins = new ArrayList<>();
		ArrayList<Integer> binsCount = new ArrayList<>();
		int big = 0;
		int ai = 0;

		for (int i = 0; i < a.size(); i++) {
			bins.add(0);
			binsCount.add(0);
		}
		for (int i = 0; i < a.size(); i++) {
			for (int b = big; b < bins.size(); b++) {

				if (a.get(i) <= (max - bins.get(b))) {
					bins.set(b, (bins.get(b) + a.get(i)));
					binsCount.set(b, (binsCount.get(b) + 1));
					if (b > big) {
						big = b;
					}
					System.out.println("Bin " + (b + 1) + ": " + bins.get(b));
					break;
				}
			}
		}
		System.out.print("Number of values in each bin:\n");
		for (int i = 0; i < binsCount.size(); i++) {
			if (bins.get(i) > 0) {
				System.out.print(binsCount.get(i) + " ");
			}
		}
		System.out.println("\nTotal number of bins used for Next Fit is " + (big + 1) + ".");
		System.out.println("\n-----------------------------");
	}

}