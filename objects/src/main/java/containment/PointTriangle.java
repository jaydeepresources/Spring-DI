package containment;

public class PointTriangle {

	Point a,b,c;	
	
	public PointTriangle() {
	
	}

	public PointTriangle(Point a, Point b, Point c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public Point getA() {
		return a;
	}

	public void setA(Point a) {
		this.a = a;
	}

	public Point getB() {
		return b;
	}

	public void setB(Point b) {
		this.b = b;
	}

	public Point getC() {
		return c;
	}

	public void setC(Point c) {
		this.c = c;
	}
	
	public void draw() {
		System.out.println("Triangle is drawn:");
		System.out.println("Point 1: " + a.getX() + "," + a.getY());
		System.out.println("Point 2: " + b.getX() + "," + b.getY());
		System.out.println("Point 3: " + c.getX() + "," + c.getY());
	}
}
