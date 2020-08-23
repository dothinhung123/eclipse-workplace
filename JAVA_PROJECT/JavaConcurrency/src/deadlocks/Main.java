package deadlocks;

public class Main {
	public static Object lock1 = new Object();
	public static Object lock2 = new Object();
public static void main(String[] args) {
	new Thread1().start();
	new Thread2().start();
}
private static class Thread1 extends Thread{
	public void run() {
		synchronized(lock1) {
			System.out.println("Thread 1 : Has lock1");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Thread 1 : waiting for lock2");
			synchronized(lock2) {
				System.out.println("Thread 2 : has lock1 and lock2");
			}
			System.out.println("Thread 1 : Released lock2");
			
		}
		System.out.println("Thread 1 : Relases lock 1. Exisiting");
		
	}
}
private static class Thread2 extends Thread{
	public void run() {
		synchronized(lock2) {
			System.out.println("Thread  : Has lock1");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Thread 1 : waiting for lock2");
			synchronized(lock1) {
				System.out.println("Thread 2 : has lock1 and lock2");
			}
			System.out.println("Thread 1 : Released lock2");
			
		}
		System.out.println("Thread 1 : Relases lock 1. Exisiting");
		
	}
}

}

