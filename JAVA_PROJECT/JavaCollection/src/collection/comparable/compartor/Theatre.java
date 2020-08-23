package collection.comparable.compartor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

public class Theatre {
private final String theatreName;
//private Collection<Seat> seats = new LinkedList<>();
private List<Seat> seats = new ArrayList<>();
 static final Comparator<Seat> PRICE_ORDER = new Comparator<Seat>() {
	 @Override
	 public int compare(Seat seat1, Seat seat2) {
	 	if(seat1.getPrice()<seat2.getPrice()) {
	 		return -1;
	 		
	 	}
	 	else if(seat1.getPrice()>seat2.getPrice()) {
	 		return 1;
	 	}
	 	else {
	 		return 0;
	 	}
	 }
 };
//private Collection<Seat> seats = new HashSet<>();
//private Collection<Seat> seats = new LinkedHashSet<>();

 public Theatre(String theatreName,int numRows, int seatsPerRow) {
	this.theatreName = theatreName;
	int lastRow = 'A' + (numRows-1);
	for(char row ='A' ; row <= lastRow;row++) {
		for(int seatNum =1; seatNum<= seatsPerRow; seatNum++) {
			double price = 12.00;
			if((row<'D') &&(seatNum>=4 &&seatNum<=9 )) {
				price = 14.00;
			}
			else if( (row>'F') || (seatNum<4 && seatNum>9)) {
				price = 7.00;
			}
			Seat seat = new Seat(row+String.format("%02d", seatNum),price);
			seats.add(seat);
		}
	}
}
public String getTheatreName() {
	return theatreName;
}
public boolean reserveSeat(String seatNumber) {
	Seat requestedSeat = new Seat(seatNumber,0);
	int foundSeat = Collections.binarySearch(seats, requestedSeat,null);
	if(foundSeat>=0) {
		return seats.get(foundSeat).reserved;
	}
	else {
		System.out.println("There is no seat" + seatNumber);
		return false;
	}
	//second way
//	for(Seat seat: seats) {
//		if(seat.getSeatNumber().equals(seatNumber)) {
//			requestedSeat = seat;
//			break;
//		}
//	}
//	if(requestedSeat==null) {
//		System.out.println("There is no seat" + seatNumber);
//		return false;
//	}
//	return requestedSeat.reserve();
	//3
//	int low = 0;
//	int high = seats.size() -1;
//	while(low<=high) {
//		System.out.print(".");
//		int mid = (low + high)/2;
//		Seat midVal = seats.get(mid);
//		int cmp = midVal.getSeatNumber().compareTo(seatNumber);
//		if(cmp <0) {
//			low = mid +1;
//		}
//		else if(cmp>0) {
//			high = mid-1;
//		}
//		else {
//			return  seats.get(mid).reserve();
//		}
//		
//	}
//	System.out.println("There is no seat" + seatNumber);
//	return false;
//	
//	
	
	
}
public Collection<Seat> getSeats() {
	return seats;
}
public class Seat implements Comparable<Seat>{
	private final String seatNumber;
	private double price;
	private boolean reserved = false;
	
	public Seat(String seatNumber,double price) {
		this.seatNumber = seatNumber;
		this.price =price;
	}
	public boolean reserve() {
		if(this.reserved) {
			this.reserved = true;
			System.out.println("Seat" + seatNumber + "reserved");
			return true;
		}
		else {
			return false;
		}
	}
	public boolean cancel() {
		if(this.reserved) {
			this.reserved = false;
			System.out.println("Reservation of seat" + seatNumber + "cancled");
			return true;
		}
		else {
			return false;
		}
	}
	public String getSeatNumber() {
		return seatNumber;
	}
	@Override
	public int compareTo(Seat seat) {
		// TODO Auto-generated method stub
		return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
	}
	public double getPrice() {
		return price;
	}
	
	
}
}
