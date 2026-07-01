package lesson_ten.vehicle;

public class Car extends Vehicle{
    private double fuel;

    public Car(String brand, int maxSpeed, int currentSpeed, double fuel) {
        super(brand, maxSpeed, currentSpeed);
        this.fuel = fuel;
    }

    @Override
    public double calculateFuelConsumption() {
        return fuel;
    }
}
