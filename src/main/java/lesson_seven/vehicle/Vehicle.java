package lesson_seven.vehicle;

public abstract class Vehicle {
    protected double speed;
    protected double fuel;
    protected final int maxSpeed;

    public Vehicle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
        this.speed = 0;
        this.fuel = 50.0;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public void startEngine() {
        System.out.println("Engine on");
    }

    public final void accelerate(int increase) {

        if (this.speed + increase > this.maxSpeed) {
            throw new IllegalArgumentException(
                    "The max speed has been exceeded"
            );
        }
        this.speed += increase;
    }

    public abstract void move();
}
