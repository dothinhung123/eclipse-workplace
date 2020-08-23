//package concurrent;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Random;
//import java.util.concurrent.locks.ReentrantLock;
//
//import multiThread.ThreadColor;
//
//public class Main2 {
//	public static final String EOF = "EOF";
//	public static void main(String[] args) {
//		List<String> buffer = new ArrayList<String>();
//		ReentrantLock bufferLock = new ReentrantLock();
//		MyProducer producer = new MyProducer(buffer,ThreadColor.ANSI_BLACK,bufferLock);
//		MyConsumer consumer1 = new MyConsumer(buffer,ThreadColor.ANSI_PRUBLE,bufferLock);
//		MyConsumer consumer2 = new MyConsumer(buffer,ThreadColor.ANSI_PRUBLE,bufferLock);
//		MyConsumer consumer3 = new MyConsumer(buffer,ThreadColor.ANSI_PRUBLE,bufferLock);
//		new Thread(producer).start();
//		new Thread(consumer1).start();
//		new Thread(consumer2).start();
//		new Thread(consumer3).start();
//	}
//	
//
//}
//class MyProducer implements Runnable{
//	private List<String > buffer;
//	private String color;
//	private ReentrantLock bufferLock;
//	public MyProducer(List<String> buffer, String color,ReentrantLock bufferLock) {
//		this.buffer = buffer;
//		this.color = color;
//		this.bufferLock=  bufferLock;
//	}
//	
//
//	@Override
//	public void run() {
//		// TODO Auto-generated method stub
//		Random random = new Random();
//		String[] nums = {"1", "2","3","4","5"};
//		for(String num:nums) {
//			try {
//				System.out.println(color + "Addding .. " + num);
//					bufferLock.lock();
//					buffer.add(num);
//				    bufferLock.unlock();
//				Thread.sleep(random.nextInt(2000));
//			}catch(InterruptedException e) {
//				System.out.println("Producer was interrupted");
//				
//				
//			}
//		}
//		System.out.println(color  + "Adding eof and existeing...");
//	    bufferLock.lock();
//		buffer.add("EOF");
//		bufferLock.unlock();
//	
//	}
//	
//}
//
//
//
//
//
//
//
//
//class MyConsumer implements Runnable{
//	
//	private List<String> buffer;
//	private String color;
//	private ReentrantLock bufferLock;
//	public MyConsumer(List<String> buffer, String color,ReentrantLock bufferLock) {
//		super();
//		this.buffer = buffer;
//		this.color = color;
//		this.bufferLock = bufferLock;
//	}
//	public void run() {
//		while(true) {
//		       bufferLock.lock();
//				if(buffer.isEmpty()) {
//					bufferLock.unlock();
//					continue;
//				}
//				if(buffer.get(0).contentEquals("EOF")) {
//					System.out.println(color + "Exisitng");
//					bufferLock.unlock();
//					break;
//				}
//				else {
//					System.out.println(color + "Removed" + buffer.remove(0));
//				}
//				bufferLock.unlock();
//			}
//		}
//	}
//	
