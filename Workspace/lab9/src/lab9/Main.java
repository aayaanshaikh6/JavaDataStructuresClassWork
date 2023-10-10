package lab9;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
	public static void main(String... args) {
		PriorityQueue<Flight> flights = new PriorityQueue<Flight>(10, new SortQueue());
		flights.add(new Flight(new Data("Memphis Belle", 2002), 1));
		flights.add(new Flight(new Data("Little Stinker", 200), 1));
		flights.add(new Flight(new Data("Hercules", 330), 2));
		flights.add(new Flight(new Data("Airbus", 300), 3));
		flights.add(new Flight(new Data("Red Baron", 200), 1));
		flights.add(new Flight(new Data("Boeing 747", 550), 1));
		flights.add(new Flight(new Data("SpaceShipOne", 3000), 2));
		flights.add(new Flight(new Data("Hindenburg", 1130), 3));
		flights.add(new Flight(new Data("Electra", 1220), 3));
		flights.add(new Flight(new Data("Bell X-1", 757), 3));
// Printing all elements
		System.out.println("The queue of flights that are departing:");
		Data[] dataRecs = new Data[10];
		int i = 0;
		while (!flights.isEmpty()) {
//store data
			dataRecs[i++] = new Data(flights.poll());
		}
		for (Data recs : dataRecs)
			System.out.println("\nFlight name: '" + recs.getName() + "' is departing now for a journey of " + recs.getMiles() + " miles, its priority number is: " + recs.getPriority());
	}
}

class SortQueue implements Comparator<Flight> {
	@Override
	public int compare(Flight f1, Flight f2) {
		if (f1.getPriority() == f2.getPriority()) {
			int res = f2.getData().getMiles() - f1.getData().getMiles();
			return res;
		} else {
			int res = f1.getPriority() - f2.getPriority();
			return res;
		}
	}
}

class Flight {
	Data data;
	private final int priority;

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	Flight(Data data2, int priority) {
		this.data = data2;
		this.priority = priority;
	}

	public Flight() {
		priority = 0;
	}

	public int getPriority() {
		return priority;
	}

	@Override
	public String toString() {
		return "Flight{ priority=" + priority + ", miles=" + data.getMiles() + ", Flightname=" + data.getName() + " }";
	}
}