package lesson_seven.smartDevice;

public class Runner {
    public static void main(String[] args) {
        SmartLight smartLight = new SmartLight("Smart light");
        SmartThermostat smartThermostat = new SmartThermostat("Smart thermostat", 35.0);
        SmartSpeaker smartSpeaker = new SmartSpeaker("Smart speaker");
        smartLight.turnOn();
        smartThermostat.turnOn();
        smartSpeaker.turnOn();
        smartLight.performAction();
        smartThermostat.performAction();
        smartSpeaker.performAction();
        smartLight.adjustBrightness(111);
        smartLight.adjustBrightness(35);
        smartThermostat.setTargetTemperature(45.0);
        smartSpeaker.playMusic("You're my heart");
        smartSpeaker.performAction();
        smartLight.turnOff();
        smartThermostat.turnOff();
        smartSpeaker.turnOff();
    }
}
