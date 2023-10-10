package TestArea;

public class Square extends Shape {
	private double side;

//constructor
	public Square(double s) {
		side = (s < 0 ? 0 : s);
		shapeName = "Square";
	}

//return the area of a Square
	public double getArea() {
		return side * side;
	}
	
	public double getPerimeter() {
		return side * 4;
	}
	
	public double getSide() {
		return side;
	}
} // end class Square