package lesson_seven.vehicle;

public class Truck extends Vehicle{
    private double cargoWeight;

    public Truck(int maxSpeed, double cargoWeight) {
        super(maxSpeed);
        this.cargoWeight = cargoWeight;
    }

    @Override
    public void move() {
        if (cargoWeight > 0) {
            fuel -= 5;
        } else {
            fuel -= 3;
        }
    }

    public void load(double weight) {
        this.cargoWeight += weight;
    }

    public void unload() {
        this.cargoWeight = 0;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "cargoWeight=" + cargoWeight +
                ", speed=" + speed +
                ", fuel=" + fuel +
                '}';
    }
}
