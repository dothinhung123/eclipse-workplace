package collection.comparable.compartor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Theatre theatre = new Theatre("Olympian",8,11);
		if(theatre.reserveSeat("D12")) {
			System.out.println("Please pay for pay for D12");
			
		}
		else {
			System.out.println("Seat already reserved");
		}
		if(theatre.reserveSeat("D13")) {
			System.out.println("Please pay for pay for D13");
			
		}
		else {
			System.out.println("Seat already reserved");
		}
		List<Theatre.Seat> reserveSeats = new ArrayList<>(theatre.getSeats());
		Collections.reverse(reserveSeats);
		printList(reserveSeats);
		List<Theatre.Seat> priceSeats = new ArrayList<>(theatre.getSeats());
		priceSeats.add(theatre.new Seat("D00",13.00));
		priceSeats.add(theatre.new Seat("D00",13.00));
		Collections.sort(priceSeats,Theatre.PRICE_ORDER);
		printList(priceSeats);
		
		
	}
	public static void printList(List<Theatre.Seat> list) {
		for(Theatre.Seat seat : list) {
			System.out.println(" " + seat.getSeatNumber());
		}
		System.out.println();
		System.out.println("..................." );
			
		
	}
//	public static void sortlist(List<? extends Theatre.Seat> list) {
//		for(int i = 0;i<list.size()-1; i++) {
//			for(int j = i+1; j<list.size(); j++) {
//				if(list.get(i).compareTo(list.get(j))>0) {
//					Collections.swap(list, i, j);
//					
//				}
//			}
//		}
//	}

}
