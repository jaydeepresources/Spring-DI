package nonStaticFactory;

public abstract class Shape {

	String name;
	float area;
	
	public Shape() {
	
	}
	
	public Shape(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "name=" + name + ", area=" + area;
	}
	
	public abstract void calcArea();
	
}
