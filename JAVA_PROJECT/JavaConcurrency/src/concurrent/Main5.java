package concurrent;

import java.util.concurrent.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

import multiThread.ThreadColor;

public class Main5 {
	public static final String EOF = "EOF";
	public static void main(String[] args) {
		ArrayBlockingQueue<String> buffer = new ArrayBlockingQueue<String>(6);
		ReentrantLock bufferLock = new ReentrantLock();
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		MyProducer producer = new MyProducer(buffer,ThreadColor.ANSI_BLACK,bufferLock);
		MyConsumer consumer1 = new MyConsumer(buffer,ThreadColor.ANSI_PRUBLE,bufferLock);
		MyConsumer consumer2 = new MyConsumer(buffer,ThreadColor.ANSI_PRUBLE,bufferLock);
		MyConsumer consumer3 = new MyConsumer(buffer,ThreadColor.ANSI_PRUBLE,bufferLock);
		executorService.execute(producer);
//		new Thread(producer).start();
//		new Thread(consumer1).start();
//		new Thread(consumer2).start();
//		new Thread(consumer3).start();
		executorService.execute(consumer1);
		executorService.execute(consumer2);
		executorService.execute(consumer3);
		Future<String> future = executorService.submit(new Callable<String>(){
			@Override
			public String call() throws Exception{
				System.out.println("bule" + "Ima being pritned for tha callable class");
				return " this iis the callbe result " ;
			}
		
		});
		executorService.shutdown();
	}
	

}
class MyProducer implements Runnable{
	private ArrayBlockingQueue<String > buffer;
	private String color;
	private ReentrantLock bufferLock;
	public MyProducer(ArrayBlockingQueue<String> buffer, String color,ReentrantLock bufferLock) {
		this.buffer = buffer;
		this.color = color;
		this.bufferLock=  bufferLock;
	}
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Random random = new Random();
		String[] nums = {"1", "2","3","4","5"};
		for(String num:nums) {
			try {
				System.out.println(color + "Addding .. " + num);
					
					buffer.put(num);
				
				Thread.sleep(random.nextInt(2000));
			}catch(InterruptedException e) {
				System.out.println("Producer was interrupted");
				
				
			}
		}
		System.out.println(color  + "Adding eof and existeing...");
	    
		try {
			buffer.put("EOF");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   
	
	}
	
}








class MyConsumer implements Runnable{
	
	private ArrayBlockingQueue<String> buffer;
	private String color;
	private ReentrantLock bufferLock;
	public MyConsumer(ArrayBlockingQueue<String> buffer, String color,ReentrantLock bufferLock) {
		super();
		this.buffer = buffer;
		this.color = color;
		this.bufferLock = bufferLock;
	}
	public void run() {
		int counter = 0 ;
		while(true) {
		    
		    	 try {
		    		 synchronized(buffer) {
						if(buffer.isEmpty()) {
						
						//	bufferLock.unlock();
							continue;
						}
						System.out.println(color + "The counter" + counter);
						counter =0;
						if(buffer.peek().contentEquals("EOF")) {
							System.out.println(color + "Exisitng");
//							bufferLock.unlock();
							break;
						}
						else {
							System.out.println(color + "Removed" + buffer.take());
						 
						}
		    		 }
						
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
		     }
		}
	}
	
