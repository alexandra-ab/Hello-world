package lesson_seven.smartDevice;

public class SmartThermostat extends SmartDevice{
    private double currentTemperature;
    private double targetTemperature;

    public SmartThermostat(String name, double targetTemperature) {
        super(name);
        this.targetTemperature = targetTemperature;
        this.currentTemperature = 22.0;
    }

    public void setTargetTemperature(double temperature) {
        this.targetTemperature = temperature;
    }

    @Override
    public void performAction() {
        System.out.println("Настройка температуры с " + this.currentTemperature + " до " + this.targetTemperature + " градусов.");
        this.currentTemperature = targetTemperature;
    }
}