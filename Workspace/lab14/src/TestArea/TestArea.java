package TestArea;

public class TestArea {
	public static void main(String args[]) {
		double side = 5.0;
		double length = 10.0;
		double width = 12.0;
		int size = 5;
		int countSqr = 0;
		int countRct = 0;
		Shape arrayOfShapes[] = new Shape[size];
		arrayOfShapes[0] = new Square(side);
		arrayOfShapes[1] = new Rectangle(length, width);
		arrayOfShapes[2] = new Square(6.0);
		arrayOfShapes[3] = new Rectangle(length, length);
		arrayOfShapes[4] = new Square(7.0);
// fill in your array to reference five various shapes from your
// child classes. Include differing data points (i.e., length, width, etc) for each object
		/*
		 * create a for - enhanced loop to iterate over each arrayofShapes to display
		 * the shape name and associated area for each object
		 */
		System.out.println("Shape Name    Area    Perimeter    Length    Width    Side");
		for(Shape shape : arrayOfShapes) {
				if(shape.shapeName == "Square") {
					System.out.println(shape.getName() + "        " + shape.getArea() + "    " + shape.getPerimeter() + "                            " + ((Square) shape).getSide());
					countSqr++;
					
				}else {
					System.out.println(shape.getName() + "     " + shape.getArea() + "   " + shape.getPerimeter() + "         " + ((Rectangle) shape).getLength() + "      " + ((Rectangle) shape).getWidth());
					countRct++;
					
				}
		}
		System.out.println("Square shape count : " + countSqr); 
		System.out.println("Rectangle shape count : " + countRct); 
	} // end main
} // end class TestArea