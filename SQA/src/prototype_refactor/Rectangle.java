package prototype_refactor;

public class Rectangle  extends Shape{
	public Rectangle() {
		type="Rectangle";
	}
	@Override
	void draw() {
		System.out.print(type);
		
	}

}
