//package providerAndCustomer;
//
//import java.util.concurrent.ThreadLocalRandom;
//
//public class Sender implements Runnable{
//	private Data data;
//	public Sender(Data data) {
//		// TODO Auto-generated constructor stub
//		this.data = data;
//	}
//	@Override
//	public void run() {
//		// TODO Auto-generated method stub
//		String packets[] = {
//				"first",
//				"sencond",
//				"third",
//				"forth",
//				"end"
//		};
//		for(String packet:packets) {
//			data.send(packet);
//			try {
//				Thread.sleep(ThreadLocalRandom.current().nextInt(1000,5000));
//			} catch (InterruptedException e) {
//				
//			}
//			
//		}
//	}
//
//}
