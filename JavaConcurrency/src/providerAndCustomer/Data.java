package providerAndCustomer;

public class Data {
	private String packet;
	// True if receiver should wait
	// Flase if sender should wait
	private boolean transfer = true;
	
	public synchronized void send(String packet) {
		// reciver wait
		while(!transfer) {
			try {
				wait();
			} catch (InterruptedException e) {
			
			}
		}
		transfer = false;
		this.packet = packet;
		notifyAll();
	}
	public synchronized String recieve() {
		while(transfer) {
			try {
				// sender wait
				wait();
			} catch (InterruptedException e) {
			
			}
			
		}
		transfer = true;
		notifyAll();
		return this.packet;
	}

}
