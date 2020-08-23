package FairLock;

public class ShareResource {
private Worker owner;

public ShareResource(Worker owner) {
	super();
	this.owner = owner;
}

public Worker getOwner() {
	return owner;
}

public void setOwner(Worker owner) {
	this.owner = owner;
}

}
