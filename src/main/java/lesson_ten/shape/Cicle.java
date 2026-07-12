package lesson_ten.shape;

public class Cicle extends Shape implements Calculable {
    private double radius;
    private static final double PI = 3.14;

    public Cicle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * PI * radius;
    }
}
