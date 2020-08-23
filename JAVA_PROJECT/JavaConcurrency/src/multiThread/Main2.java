package multiThread;

public class Main2 {
	public static void main(String[] args) {
		Countdown a = new Countdown();
		
		CountdownThread b = new CountdownThread(a);
		b.setName("Thread 1");
		b.start();
		CountdownThread c = new CountdownThread(a);
		c.setName("Thread 2");
		c.start();
	}
	

}
class Countdown {
	public synchronized void count() {
		String color;
		switch(Thread.currentThread().getName()) {
		case "Thread 1" : color="black";
		break;
		case "Thread 2" : color ="yello";
		break;
		default : color ="black";
		break;
		}
		synchronized(color) {
			for(int i = 0 ;i<10 ;i++) {
				System.out.println( i + Thread.currentThread().getName() + color );
				
			}
		}
		
	}
	
}
class CountdownThread extends Thread{
	Countdown countdown;
	public CountdownThread(Countdown countdown) {
		this.countdown = countdown;
	}
	@Override 
	public void run() {
		countdown.count();
	}
}
