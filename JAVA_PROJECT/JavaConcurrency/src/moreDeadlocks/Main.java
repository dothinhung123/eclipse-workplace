package moreDeadlocks;

public class Main {

	public static void main(String[] args) {
		PolitePerson jane = new PolitePerson("Jane");
		PolitePerson john = new PolitePerson("John");
		jane.sayHello(jane);
		john.sayHello(john);
		// TODO Auto-generated method stub
		new Thread(new Runnable() {
			@Override
			public void run() {
				jane.sayHello(john);
			}
		}).start();
		new Thread(new Runnable() {
			@Override
			public void run() {
				john.sayHello(jane);
			}
		}).start();
		
		

	}
	static class PolitePerson{
		private final String name;
		public PolitePerson(String name) {
			this.name = name;
		}
		public String getName() {
			return name;
		}
		public synchronized void sayHello(PolitePerson person) {
			System.out.println(person.getName());
			person.sayHelloBack(this);
		}
		public synchronized void sayHelloBack(PolitePerson person) {
			System.out.println(person.getName());
			
		}
	}
}
