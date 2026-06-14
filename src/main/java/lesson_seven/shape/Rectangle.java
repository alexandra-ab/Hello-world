package lesson_seven.shape;

public class Rectangle extends Shape{
    private double width;
    private double high;

    public Rectangle(String color, double width, double high) {
        super(color);
        this.width = width;
        this.high = high;
    }

    @Override
    public double getArea() {
        return width * high;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", high=" + high +
                ", color =" + color +
                '}';
    }
}
