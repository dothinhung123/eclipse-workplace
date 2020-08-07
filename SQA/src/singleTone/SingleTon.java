package singleTone;

public class SingleTon {
public static SingleTon instance;
private SingleTon() {
	
}
public static SingleTon getInstance() {
	if(instance==null) {
		instance = new SingleTon();
	}
	return instance;
	
}
public void showWorld(){
	System.out.print("Hellow rod");
}
}
