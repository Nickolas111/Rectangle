package lesson02.homework.Rectangle;

import java.util.ArrayList;

public class Rectangles {
	private final ArrayList<Rectangle> rectangles = new ArrayList<>();

    public void addRectangle(Rectangle rectangle) {
        rectangles.add(rectangle);
    }

    public long sumOfSquare() {
        long sum = 0;
        for (Rectangle rectangle : rectangles) {
            sum += rectangle.square();
        }
        return sum;
    }

    @Override
    public String toString() {
        String res = "Rectangles{";
        for (Rectangle elem : rectangles) {
            res = res + (elem.toString() + "\n");
        }
        return res.substring(0,res.length()-2).concat("}");
    }
}
