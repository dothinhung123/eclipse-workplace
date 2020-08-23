package concurrentRedo;

public class Main2 {
	public static void main(String[] args) {
		
	}

}
class Message{
	private String data;
	private boolean transfer;
	public void read(String text) {
		while(!transfer) {
			
			
		}
		transfer = false;
		System.out.println(text);
	}
	public String writer() {
		while(transfer) {
			
		}
		transfer = true;
		return this.data;
	}
}
class Provider{
	
	
}
class Consumer{
	
}
