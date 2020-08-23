//package ProducerAndCustomer;
//
//import java.util.Random;
//
//public class Redo1 {
//public static void main(String args[] ) {
//	Message message = new Message();
//	(new Thread(new Writer(message))).start();
//	(new Thread(new Read(message))).start();
//}
//}
//class Message{
//	private String message;
//	private boolean empty= true;
//	public  synchronized String read() {
//		while(empty) {
//			try {
//				wait();
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		empty=true;
//		notifyAll();
//		return this.message;
//		
//	}
//	public void write(String text) {
//		while(!empty) {
//			try {
//				wait();
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		empty = false;
//		notifyAll();
//		this.message = text;
//	}
//	
//}
//class Writer implements 
//Runnable{
//	private Message message;
//	public Writer(Message message) {
//		this.message = message;
//	}
//	@Override
//	public void run() {
//		// TODO Auto-generated method stub
//		Random a = new Random();
//		String texts[] = {"1","2","3","4","6"};
//		for(int i = 0 ;i<texts.length ;i++) {
//			message.write(texts[i]);
//			try {
//				Thread.sleep(a.nextInt(2000));
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		message.write("Finished");
//	}
//}
//class Read implements Runnable{
//	private Message message;
//	public Read(Message message) {
//		this.message = message;
//	}
//	@Override
//	public void run() {
//		Random a = new Random ();
//		for(String lastestMessage = message.read(); !lastestMessage.equals("Finished");) {
//		System.out.println(message.read());
//			try {
//				Thread.sleep(a.nextInt(2000));
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		
//	}
//}
