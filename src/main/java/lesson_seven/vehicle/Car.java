package lesson_seven.vehicle;

public class Car extends Vehicle {
    private int passengers;

    public Car(int maxSpeed, int passengers) {
        super(maxSpeed);
        this.passengers = passengers;
    }

    @Override
    public void move() {
        fuel -= 2;
        double distance = speed * 1;
        System.out.println("Distance: " + distance);
    }

    @Override
    public String toString() {
        return "Car{" +
                "passengers=" + passengers +
                ", speed=" + speed +
                ", fuel=" + fuel +
                '}';
    }
}