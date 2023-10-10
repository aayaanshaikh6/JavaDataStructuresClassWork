package TestArea;

public class Rectangle extends Shape {
	private double length, width;

// constructor
	public Rectangle(double s1, double s2) {
		length = (s1 < 0 ? 0 : s1);
		width = (s2 < 0 ? 0 : s2);
		shapeName = "Rectangle";
	}

// return the area of a Rectangle
	public double getArea() {
		return length * width;
	}
	
	public double getPerimeter() {
		return (length * 2) + (width * 2);
	}
	
	public double getLength() {
		return length;
	}
	
	public double getWidth() {
		return width;
	}
} // end class Rectangle