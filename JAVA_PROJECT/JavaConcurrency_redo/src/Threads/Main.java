package Threads;

public class Main {
public static void main(String[] args) {
	Thread anotherThread = new anotherThread();
	anotherThread.start();
	new Thread() {
		public void run() {
			System.out.println("Thread 2");
		}
	}.start();
	Thread myrunnalbe = new Thread(new MyRunnable());
	myrunnalbe.start();
//	anotherThread.interrupt();
	
	
}
}
class anotherThread extends Thread {
	 @Override
	 public void run() {
//		 try {
//			 Thread.sleep(3000);
//			 
//		 }catch(InterruptedException e) {
//			 System.out.println("ERROR");
//		 return;
//		 }
		 
		 System.out.println("Another thread");
	 
	 }
}
