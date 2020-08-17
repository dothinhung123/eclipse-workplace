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
		b.setName("==Another thread class");
//		RunanbleAbastraction a = new RunanbleAbastraction();
//	    a.run();
		Thread a = new Thread( new RunanbleAbastraction());
		a.start();
		Thread d = new Thread(new RunanbleAbastraction () {
			@Override
			public void run() {
				System.out.print("HELLO from another class");
				try {
					b.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
				System.out.println("I couldn t wait after all i was interrupt");
				}
			}
			
		});
		d.start();
	    
		
	}
	

}
