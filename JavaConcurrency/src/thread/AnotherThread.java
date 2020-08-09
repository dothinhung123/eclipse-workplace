package thread;

public class AnotherThread extends Thread{
	@Override
	public void run() {
		System.out.println(Color.ANSI_READ+"I MISS YOU");
	}

}
