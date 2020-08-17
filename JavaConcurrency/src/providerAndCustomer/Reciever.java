package providerAndCustomer;

import java.util.concurrent.ThreadLocalRandom;

public class Reciever implements Runnable{
	private Data data;
	public Reciever(Data data) {
		this.data=data;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(String recievedMessage  = data.recieve();recievedMessage.equals("End");
				recievedMessage= data.recieve()) {
			System.out.println("Recied message");
			 try {
				Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 5000));
			} catch (InterruptedException e) {
			
			}
		}
	}

}
