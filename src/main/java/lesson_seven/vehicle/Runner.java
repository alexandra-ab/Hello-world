package lesson_seven.vehicle;

public class Runner {
    public static void main(String[] args) {
        Car lexus = new Car(300, 5);
        Car audi = new Car(350, 5);
        Truck mercedes = new Truck(180, 100);
        Truck volvo = new Truck(200, 0);
        lexus.accelerate(40);
        volvo.accelerate(100);
        mercedes.accelerate(100);
        lexus.move();
        volvo.move();
        System.out.println(volvo);
        mercedes.unload();
        System.out.println(mercedes);
        mercedes.load(35.5);
        System.out.println(mercedes);
    }
}
