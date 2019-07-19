package nonStaticFactory;

public class Square extends Shape {

	int side;
	
	public Square() {
	
	}
	
	public Square(String name,int side) {
		super(name);
		this.side = side;
	}

	@Override
	public void calcArea() {
		area = side*side;
	}

	@Override
	public String toString() {
		return super.toString() + ", side=" + side;
	}
	
}
