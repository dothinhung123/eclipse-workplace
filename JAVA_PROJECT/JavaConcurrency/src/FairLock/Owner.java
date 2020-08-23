package FairLock;

public class Owner {
	private Worker owner;

	public Owner(Worker owner) {
		super();
		this.owner = owner;
	}
	public synchronized void setOwner(Worker worker) {
		this.owner = owner;
	}


}
