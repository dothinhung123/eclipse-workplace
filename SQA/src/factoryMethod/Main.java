package factoryMethod;

public class Main {
	public static void main(String[] args) {
		ShapeFactoryMethod shape = new ShapeFactoryMethod();
       Shape circle =  shape.getShape("circle");
        Shape triangle  =shape.getShape("Triangle");
      Shape Rectangel =   shape.getShape("Rectangle");
      circle.draw();
      triangle.draw();
      Rectangel.draw();
       
	}
	

}
