package MutilpleThread;

public class Main {
public static void main(String[] args) {
	CountDown a = new CountDown();
	Thread b = new CountDownThread( a);
	b.setName("Thread 2");
	b.start();
	Thread c = new CountDownThread( a);
	c.setName("Thread 1");
	c.start();

	
	
	
}
}

 class CountDown{
	 public  synchronized void count() {
		 String color;
		 switch(Thread.currentThread().getName()) {
		 case "Thread 1" : color = "black";
		 break;
		 case "Thread 2" : color ="Yellow";
		 break;
		 default:
			 color ="blue";
			 break;
		 }
		synchronized(color) {
			for(int  i =  0 ;i<10 ;i++) {
				System.out.println(Thread.currentThread().getName() + i + color );
				
			}
		}
		 
	 }
	
}
 class CountDownThread extends Thread{
	 private CountDown countdown;
	 public CountDownThread(CountDown countdown) {
		 this.countdown = countdown;
	 }
	 @Override
	 public void run() {
		 countdown.count();
	 }
	
}
