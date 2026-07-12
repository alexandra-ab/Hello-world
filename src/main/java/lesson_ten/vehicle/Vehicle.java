package lesson_ten.vehicle;

public abstract class Vehicle {
    protected String brand;
    protected int maxSpeed;
    protected int currentSpeed;
    protected boolean engineStarted;

    public Vehicle(String brand, int maxSpeed, int currentSpeed) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
        this.currentSpeed = currentSpeed;
        this.engineStarted = false;
    }

    public void startEngine() {
        engineStarted = true;
        String startEngine = String.format("%s: двигатель запущен.", brand);
        System.out.println(startEngine);
    }

    public void move() {
        if (engineStarted) {
            String move = String.format("%s движется со скорость %d км/ч.", brand, currentSpeed);
            System.out.println(move);
        } else {
            String move = String.format("Нужно включить двигатель в %s.", brand);
            System.out.println(move);
        }
    }

    public void stopEngine() {
        engineStarted = false;
        String stopEngine = String.format("%s: двигатель остановлен.", brand);
        System.out.println(stopEngine);
    }

    public abstract double calculateFuelConsumption();
}
