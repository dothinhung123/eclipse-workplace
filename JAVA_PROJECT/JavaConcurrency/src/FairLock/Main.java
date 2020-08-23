package FairLock;

import java.util.concurrent.locks.ReentrantLock;

public class Main {
	private static ReentrantLock lock = new ReentrantLock(true);
	public static void main(String[] args) {
		Thread t1 = new Thread(new Worker("bule"),"PRIAORY 10");
		Thread t5 = new Thread(new Worker("bul"),"PRIAORY 10");
		Thread t2= new Thread(new Worker("bu"),"PRIAORY 10");
		Thread t3 = new Thread(new Worker("b"),"PRIAORY 10");
		Thread t4 = new Thread(new Worker(""),"PRIAORY 10");
       t1.setPriority(10);
       t2.setPriority(8);
       t3.setPriority(6);
       t4.setPriority(4);
       t5.setPriority(2);
       t1.start();
       t2.start();
       t3.start();
       t4.start();
       t5.start();
	}
	private static class Worker implements Runnable{
		private int runCount= 1;
		private String threadColor;
		public Worker(String threadColor) {
			this.threadColor = threadColor;
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			for(int i = 0 ;i<100;i++) {
				lock.lock();
				try {
				System.out.println(runCount  + " " + i + Thread.currentThread().getName() + threadColor);
				// execute critical section of code 
				} finally {
					lock.unlock();
				}
				}
			
		}
		
	}

}
