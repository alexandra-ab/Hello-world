package lesson_five;

public class Car {
    String brand;
    String model;
    double mileage;
    double fuelLevel;

    public Car(String brand, String model, double mileage, double fuelLevel) {
        this.brand = brand;
        this.model = model;
        this.mileage = mileage;
        this.fuelLevel = fuelLevel;
    }

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.mileage = 0.0;
        this.fuelLevel = 50.0;
    }

    public void drive(double distance) {
        if (fuelLevel < 0) {
            System.out.println("Not enough fuel!");
        }
        mileage += distance;
        fuelLevel -= distance * 0.1;
    }

    public void refuel(double fuelAmount) {
        fuelLevel += fuelAmount;
    }
}
