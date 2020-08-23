package LamdasIntro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
//		new Thread(new Runnable() {
//			@Override
//			public void run() {
//				System.out.println("Priint from the runanble");
//			}
//		}).start();
//		new Thread(new CodeToRun()).start();
//		new Thread(()->{System.out.println("i like ");System.out.println("i  yoiu");}).start();
	Employee john = new Employee("John Doe",30);
	Employee tim = new Employee("Tim",43);
	Employee jack = new Employee("Tim",43);
	Employee sn = new Employee("Snow white" , 22);
	List<Employee> employees = new ArrayList<>();
	employees.add(john);
	employees.add(tim);
	employees.add(jack);
	employees.add(sn);
//	Collections.sort(employees,new Comparator<Employee>() {
//		@Override 
//		public int compare(Employee em1, Employee em2) {
//			return em1.getName().compareTo(em2.getName());
//		}
//	});
	Collections.sort(employees,(Employee e1,Employee e2)->
	e1.getName().compareTo(e2.getName()));
	
//	for(Employee employee : employees) {
//		System.out.println(employee.getName());
//	}
	employees.stream().collect(Collectors.toSet()).forEach(System.out::println);
	}


}
class CodeToRun implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Hello world");
	}
	
}
