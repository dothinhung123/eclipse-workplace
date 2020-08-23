package ProducerAndCustomer;

import java.util.Random;




public class Main {
public static void main(String[] args) {
	Message message = new Message();
//new Thread(new Write(message)).start();
(new Thread(new Write(message))).start();
(new Thread(new Read(message))).start();
	
	}


}
class Message{
	private String message;
	private boolean empty = true;
	
	public synchronized String read() {
		while(empty) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		empty = true;
		notifyAll();
		return this.message;
	}
	public synchronized void writer(String text) {
		while(!empty) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		empty  = false;
		notifyAll();
		this.message = text;
	}

	
}

class Write implements Runnable{
	Message message;
	public Write(Message message) {
		this.message = message;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Random random = new Random();
		String[] texts = {
				"1","2","3","4"
		};
		for(int i = 0 ;i<texts.length;i++) {

			message.writer(texts[i]);
			try {
				Thread.sleep(random.nextInt(2000));
				
			}catch(InterruptedException e) {
				System.out.println("Interrupt");
			}
			
		}
		message.writer("Finished");
		
	}
	

	
}
class Read implements Runnable{
	private Message message;
	public Read(Message message) {
		this.message = message;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Random random = new Random();
		for(String lastestMessage = message.read(); !lastestMessage.equals("Finished");) {
			lastestMessage  = message.read();
			System.out.println(lastestMessage);
			
			try {
				Thread.sleep(random.nextInt(2000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
}