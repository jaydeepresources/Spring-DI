package containment;

import java.util.List;

public class PointTriangle {

	List<Point> points;
	
	public PointTriangle() {
	
	}
	
	public PointTriangle(List<Point> points) {
		super();
		this.points = points;
	}

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}

	public void draw() {
		System.out.println("Triangle is drawn:");
		for(Point p:points)
			System.out.println("Point: " + p.getX() + "," + p.getY());
	}
}
