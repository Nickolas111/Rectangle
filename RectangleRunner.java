package lesson02.homework.Rectangle;

public class RectangleRunner {
	public static void main(String[] args) {
		Rectangles listOfRectangles = new Rectangles();
        listOfRectangles.addRectangle(new Rectangle(100, 200));
        listOfRectangles.addRectangle(new Rectangle(500, 50));
        listOfRectangles.addRectangle(new Rectangle(200, 250));

        System.out.println(listOfRectangles);
        System.out.println(listOfRectangles.sumOfSquare());
    }
}
