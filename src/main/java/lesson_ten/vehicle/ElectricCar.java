package lesson_ten.vehicle;

public class ElectricCar extends Vehicle implements Rechargeable{
    private int batteryLevel;

    public ElectricCar(String brand, int maxSpeed, int currentSpeed, int batteryLevel) {
        super(brand, maxSpeed, currentSpeed);
        this.batteryLevel = batteryLevel;
    }

    @Override
    public void recharge() {
        batteryLevel = 100;
        String recharge = String.format("Батарея в %s полностью заряжена.", brand);
        System.out.println(recharge);
    }

    @Override
    public void checkBatteryStatus() {
        String checkBatteryStatus = String.format("Заряд батареи в %s составляет %d процентов.", brand, batteryLevel);
        System.out.println(checkBatteryStatus);
    }

    @Override
    public double calculateFuelConsumption() {
        return batteryLevel;
    }
}
