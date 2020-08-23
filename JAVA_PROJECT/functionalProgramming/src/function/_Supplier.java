package function;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {
	public static void main(String[] args) {
		System.out.println(getDBConnectionURL());
		System.out.println(getUrl.get());
		System.out.println(getj.get());
	}
	static String getDBConnectionURL() {
		return "jdbc://localhost:5432/users";
	}
	static Supplier<String> getUrl= ()->"jdbc://localhost:5342/users";
	static Supplier<List<String>> getj =()-> List.of("hello","f");
}
