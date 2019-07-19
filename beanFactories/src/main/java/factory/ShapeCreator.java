package factory;

public class ShapeCreator {

	public static Shape createShape(String name) {

		switch (name) {
		case "circle":
			return new Circle(name, 5.6f);

		case "square":
			return new Square(name, 5);
		}
		return null;
	}
}
