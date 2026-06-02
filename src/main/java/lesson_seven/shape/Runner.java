package lesson_seven.shape;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Runner {
    public static void main(String[] args) {
        Circle circleOne = new Circle("White", 2.0);
        Rectangle rectangleOne = new Rectangle("Blue", 1.0, 5.0);
        System.out.println(circleOne.getArea());
        System.out.println(circleOne);
        System.out.println(rectangleOne.getArea());
        System.out.println(rectangleOne);
    }
}
