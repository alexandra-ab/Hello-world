package lesson_ten.vehicle;

public class Runner {
    public static void main(String[] args) {
        Truck volvo = new Truck("Volvo", 100, 80, 59.5);
        ElectricCar tesla = new ElectricCar("Tesla", 250, 150, 69);
        Car mercedes = new Car("Mercedes", 250, 140, 37.5);

        volvo.calculateFuelConsumption();
        volvo.loadCargo(7.0);
        volvo.startEngine();
        volvo.move();
        volvo.stopEngine();
        volvo.unloadCargo();
        tesla.startEngine();
        tesla.move();
        tesla.checkBatteryStatus();
        tesla.stopEngine();
        tesla.recharge();
        mercedes.calculateFuelConsumption();
        mercedes.startEngine();
        mercedes.move();
        mercedes.stopEngine();
    }
}
