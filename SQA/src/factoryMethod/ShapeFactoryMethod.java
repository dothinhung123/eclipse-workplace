package factoryMethod;

public class ShapeFactoryMethod {

 public ShapeFactoryMethod() {
	 
 }
 public Shape getShape (String value) {
	 if(value==null) {
		 return null;
	 }
 else if(value.equalsIgnoreCase("Circle")) {
		 return new Circle();
	 }
	 else if(value.equalsIgnoreCase("Rectangle")) {
		 return new Rectangle();
	 }
	 else if(value.equalsIgnoreCase("Triangle")) {
		 return new Triangle();
	 }
	 return null;
 }
}
