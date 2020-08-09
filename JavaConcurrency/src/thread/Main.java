package thread;

public class Main {
	public static void main(String[] args) {
		System.out.print( Color.ANSI_PRUBLE+"Hello world");
		AnotherThread b = new AnotherThread();
		b.start();
		new Thread() {
			public void run() {
				System.out.println( Color.ANSI_BLUE +"I lik you");
			}
		}.start();
		
	}
	

}
