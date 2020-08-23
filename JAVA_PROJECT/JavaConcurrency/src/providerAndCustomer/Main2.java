//package providerAndCustomer;
//
//import java.util.Random;
//
//public class Main2 {
//	public static void main(String[] args) {
//		Message message = new Message();
//		(new Thread(new Sender(message))).start();
//		(new Thread(new Reciever(message))).start();
//	}
//
//}
//class Message{
//	private String text;
//	private boolean transfer;
//	
//	public void send(String text) {
//		while(!transfer) {
//			
//		}
//		transfer = false;
//		
//		}
//	public String recieve() {
//		while(transfer) {
//			
//		}
//		transfer = true;
//		return text;
//	}
//}
//class Sender extends Thread{
//	private Message message ;
//	public Sender(Message message) {
//		this.message = message;
//	}
//	@Override
//	public void run() {
//		Random random = new Random();
//		String[] texts = {
//				"1","2","3","4"
//		};
//		for(String text:texts) {
//			System.out.println(text);
//			message.send(text);
//			try {
//				Thread.sleep(random.nextInt(2000));
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		
//	}
//	
//	}
//class Reciever extends Thread{
//	private Message message;
//	public Reciever(Message message) {
//		
//	}
//	@Override
//	public void run() {
//		Random random = new Random();
//		for(String lastMessae = message.recieve(); !lastMessae.equals("Finished");) {
//			message.recieve();
//			System.out.println(lastMessae);
//		}
//		try {
//			Thread.sleep(random.nextInt(2000));
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//}
