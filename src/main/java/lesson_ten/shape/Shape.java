package lesson_ten.shape;

public abstract class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public void printColor() {
        System.out.println(color);
    };
}
