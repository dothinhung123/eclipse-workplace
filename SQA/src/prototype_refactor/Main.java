package prototype_refactor;

public class Main {
	public static void main(String[] args) {
		ShapeCache.loadCache();
		
		Shape a= ShapeCache.getShape("1");
	System.out.print(a.getType());	
		Shape b = ShapeCache.getShape("2");
		System.out.print(b.getType());
	}

}
