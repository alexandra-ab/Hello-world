package lesson_seven.smartDevice;

public class SmartLight extends SmartDevice {
    private int brightess;

    public SmartLight(String name) {
        super(name);
    }

    public void adjustBrightness(int level) {
        if (!isOn) {
            System.out.println("Устройство не включено.");
        } else if (level > 0 && level < 100) {
            brightess = level;
        } else {
            System.out.println("Яркость должна быть больше 0 и меньше 100.");
        }
    }

    @Override
    public void performAction() {
        if (!isOn) {
            System.out.println("Устройство не включено.");
        } else {
            brightess = 50;
            System.out.println("Устройство включено на яркость " + brightess + " %");
        }
    }
}