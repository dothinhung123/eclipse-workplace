package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Theatre theatre = new Theatre("Olympian",8,11);
		List<Theatre.Seat> seatCopy = new ArrayList<>(theatre.seats);
		printList(seatCopy);
		
		seatCopy.get(1).reserve();
		if(theatre.reserveSeat("A02")) {
			System.out.println("Please pay for pay for A02");
			
		}
		else {
			System.out.println("Seat already reserved");
		}
		Collections.reverse(seatCopy);
		System.out.println("Print seatcopy");
		printList(seatCopy);
		System.out.println("Pringting theatre.seat");
		printList(theatre.seats);
		
		Theatre.Seat minSeat = Collections.min(seatCopy);
		Theatre.Seat maxSeat = Collections.max(seatCopy);
		System.out.println("Min seat number is" + minSeat.getSeatNumber());
		System.out.println("Max seat number is" + maxSeat.getSeatNumber());
		List<Theatre.Seat> newList = new ArrayList<>(theatre.seats.size());
		Collections.copy(newList, theatre.seats);
	}
	public static void printList(List<Theatre.Seat> list) {
		for(Theatre.Seat seat : list) {
			System.out.println(" " + seat.getSeatNumber());
		}
		System.out.println();
		System.out.println("..................." );
			
		
	}
	public static void sortlist(List<? extends Theatre.Seat> list) {
		for(int i = 0;i<list.size()-1; i++) {
			for(int j = i+1; j<list.size(); j++) {
				if(list.get(i).compareTo(list.get(j))>0) {
					Collections.swap(list, i, j);
					
				}
			}
		}
	}

}
