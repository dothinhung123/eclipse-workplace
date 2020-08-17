package thread;

public class AnotherThread extends Thread{
	@Override
	public void run() {
		System.out.println(Color.ANSI_READ+"I MISS YOU"  + currentThread().getName());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
		System.out.println("Another thread woke me up");
		
		}
		System.out.println("Thre secoonds");
	}
	

}
