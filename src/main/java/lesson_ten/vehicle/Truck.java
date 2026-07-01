package lesson_ten.vehicle;

public class Truck extends Vehicle implements Loadable{
    private double fuel;
    private double cargoWeight;

    public Truck(String brand, int maxSpeed, int currentSpeed, double fuel) {
        super(brand, maxSpeed, currentSpeed);
        this.fuel = fuel;
    }

    @Override
    public void loadCargo(double weight) {
        cargoWeight = weight;
        String loadCargo = String.format("В %s загруженно %.2f кг груза.", brand, cargoWeight);
        System.out.println(loadCargo);
    }

    @Override
    public void unloadCargo() {
        cargoWeight = 0;
        String unloadCargo = String.format("Из %s груз разгружен.", brand);
        System.out.println(unloadCargo);
    }

    @Override
    public double calculateFuelConsumption() {
        return this.fuel;
    }
}
