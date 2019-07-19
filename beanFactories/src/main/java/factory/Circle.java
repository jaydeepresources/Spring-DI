package factory;

public class Circle extends Shape {

	float radius;
	
	public Circle() {
	
	}
	
	public Circle(String name, float radius) {
		super(name);
		this.radius = radius;
	}

	@Override
	public void calcArea() {
		area = 3.14f*radius*radius; 				
	}

	@Override
	public String toString() {
		return super.toString() + ", radius=" + radius;
	}
	
}
