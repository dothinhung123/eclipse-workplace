package FairLock;

public class Worker {
	private String name;
	private boolean acitve;
	public Worker(String name, boolean acitve) {
	
		this.name = name;
		this.acitve = acitve;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isAcitve() {
		return acitve;
	}
	public void setAcitve(boolean acitve) {
		this.acitve = acitve;
	}
	public synchronized void work(ShareResource shareResource , Worker otherWorker) {
		while(acitve) {
			if(shareResource.getOwner() != this) {
				try {
					wait(10);
				}catch(InterruptedException e) {
					System.out.println("Interrupt");
				}
				
				continue;
			}
			if(otherWorker.isAcitve()) {
				System.out.println(getName() +" given the resource to the worker" + otherWorker.getName());
				shareResource.setOwner(otherWorker);
				continue;
			}
			System.out.println(getName() + " : is woring on the common resource");
		   acitve = false;
		 shareResource.setOwner(otherWorker);
		}
	}

}
