package Threads;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		anotherThread a = new anotherThread();
		
		try {
			a.join(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("I couldnt join");
		}// TODO Auto-generated method stub
		System.out.println("Hello word");
	}

}
