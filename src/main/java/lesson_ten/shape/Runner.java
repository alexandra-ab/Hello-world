package lesson_ten.shape;

public class Runner {
    public static void main(String[] args) {
        Cicle one = new Cicle(2.3, "red");
        System.out.println(one.calculateArea());
        one.printColor();
        System.out.println(one.calculatePerimeter());
    }
}
