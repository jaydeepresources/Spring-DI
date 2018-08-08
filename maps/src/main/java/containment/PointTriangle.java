package containment;

import java.util.Map;

public class PointTriangle {

	Map<Integer, Point> points;
	String type;

	@Override
	public String toString() {
		return "PointTriangle [points=" + points + ", type=" + type + "]";
	}

	public Map<Integer, Point> getPoints() {
		return points;
	}

	public void setPoints(Map<Integer, Point> points) {
		this.points = points;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public PointTriangle() {

	}
}
