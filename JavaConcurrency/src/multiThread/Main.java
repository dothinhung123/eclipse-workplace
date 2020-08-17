package multiThread;

public class Main {
	public static void main(String[] args) {
		Countdown countdown = new Countdown();
		
		CountdownThread t1 = new CountdownThread(countdown);
		t1.setName("Thread 1");
		t1.start();
		CountdownThread t2 = new CountdownThread(countdown);
		t2.setName("Thread 2");
		
		t2.start();
	}

}
class Countdown{
	public synchronized void doCountDown() {
		String color;
		switch(Thread.currentThread().getName()) {
		case "Thread 1" : 
			color = ThreadColor.ANSI_BLACK;
		case "Thread 2" :
			color = ThreadColor.ANSI_BLUE;
		default: 
			color = ThreadColor.ANSI_GREEN;
		}
		synchronized(color) {
			// synchronized đánh dấu một khối này trong 1 thời điểm chỉ cho phép 1 thread được try cập vào
			// nếu khối nào cố gắng try cập vào thì sẽ bị block cho đến khi thread trong khối đồng bộ thoat ra ngoài
			for(int i = 10;i>0; i--) {
				System.out.println(color + Thread.currentThread().getName() + ":I"  +i);
				
			}
			
			
		}
		
			
	}
	
	
}
class CountdownThread extends Thread{
	private Countdown threadCountdown;
	public CountdownThread(Countdown countdown) {
		threadCountdown = countdown;
	}
	public void run() {
		threadCountdown.doCountDown();
	}
}

