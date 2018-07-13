package lesson02.homework.Rectangle;

public class Rectangle {
	private final long heigth;
    private final long width;

    public Rectangle(long heigth, long width) {
        this.heigth = heigth;
        this.width = width;
    }

    public long getHeigth() {
        return heigth;
    }

    public long perimeter() {
        return 2*(width+heigth);
    }

    public long square(){
        return width*heigth;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "heigth=" + heigth +
                ", width=" + width +
                '}';
    }
}
