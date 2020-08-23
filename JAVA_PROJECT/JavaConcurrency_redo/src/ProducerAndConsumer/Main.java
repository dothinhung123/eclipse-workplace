package ProducerAndConsumer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
public static void main(String[] args) {
	List<String> buffer = new ArrayList<>();
	MyProducer producer = new MyProducer(buffer,"bule");
	MyConsumer consumer1 = new MyConsumer(buffer,"yello");
	(new Thread(producer)).start();
	(new Thread(consumer1)).start();
}
}
class MyProducer implements Runnable{
	private List<String> buffer ;
	private String color;
	public MyProducer(List<String> buffer, String color) {
		this.buffer = buffer;
		this.color=color;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Random random = new Random();
		String[] nums = {"1","2","3","4","3"};
		for(String num : nums) {
			buffer.add(num);
			try {
				Thread.sleep(random.nextInt(1000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(color + "Adding EOF and existsing...");
		buffer.add("EOF");
	}
	
}
class MyConsumer implements Runnable{
	private List<String> buffer;
	private String color;
	public MyConsumer(List<String> buffer, String color) {
		super();
		this.buffer = buffer;
		this.color = color;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			if(buffer.isEmpty()) {
				continue;
			}
			if(buffer.get(0).equals("EOF")) {
				System.out.println(color + "Exisiting");
			break;
			}
			else {
				System.out.println(color + "Removed" + buffer.remove(0));
			}
		}
	}
	
	
	
}