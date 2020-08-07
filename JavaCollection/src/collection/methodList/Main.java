package collection.methodList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Theatre theatre = new Theatre("Olympian",8,11);
		theatre.getSeats();
		if(theatre.reserveSeat("D12")) {
			System.out.println("Please pay");
		}
		else {
			System.out.println("Sorry, seat is taken");
			
		}
		if(theatre.reserveSeat("H11")) {
			System.out.print("Please pay");
		}
		else {
			System.out.print("Sorry , seat is taken");
		}
	}

}
