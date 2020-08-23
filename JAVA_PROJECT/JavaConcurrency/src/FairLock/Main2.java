package FairLock;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      final Worker worker1 = new Worker("Worker1",true);
      final Worker worker2 = new Worker("Worker2",true);
      
      final ShareResource shareResource = new ShareResource(worker1);
      new Thread(new Runnable() {
    	  @Override
    	  public void run() {
    		  worker1.work(shareResource, worker2);
    		  
    	  }
      }).start();
      new Thread(new Runnable() {
    	  @Override
    	  public void run() {
    		  worker2.work(shareResource, worker1);
    		  
    	  }
      }).start();
	}

}
