package prototype_refactor;

import java.util.HashMap;

public class ShapeCache {
	private static HashMap<String , Shape> shapeMap = new HashMap<String ,Shape>();
	public static Shape getShape(String shapeId) {
	Shape a = shapeMap.get(shapeId);
			return (Shape) a.clone();
		
		
	}
	public static void loadCache() {
		Circle a = new Circle();
		a.setId("1");
		shapeMap.put(a.getId(),a);
		Rectangle r = new Rectangle();
		r.setId("2");
		shapeMap.put(r.getId(), r);
	}
	

}
