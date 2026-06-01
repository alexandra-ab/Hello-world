package lesson_six;

public class MobilePhone {
    private String brand;
    private String model;
    private int batteryLevel;
    private String contact1;
    private String contact2;

    public MobilePhone(String brand, String model, int batteryLevel, String contact1, String contact2) {
        this.brand = brand;
        this.model = model;
        this.batteryLevel = batteryLevel;
        this.contact1 = contact1;
        this.contact2 = contact2;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public String getContact1() {
        return contact1;
    }

    public String getContact2() {
        return contact2;
    }

    public void setBatteryLevel(int batteryLevel) {
        if (batteryLevel >= 0 && batteryLevel <= 100) {
            this.batteryLevel = batteryLevel;
        } else {
            System.out.println("Invalid battery level!");
        }
    }

    public void setContact1(String contact1) {
        if (!contact1.isEmpty()) {
            this.contact1 = contact1;
        } else {
            System.out.println("Invalid contact 1!");
        }
    }

    public void setContact2(String contact2) {
        if (!contact2.isEmpty()) {
            this.contact2 = contact2;
        } else {
            System.out.println("Invalid contact 2!");
        }
    }

    public void callContact(String name) {
        if (this.batteryLevel <= 10) {
            System.out.println("Battery too low!");
            return;
        } else {
            if (this.contact1.equals(name) || this.contact2.equals(name)) {
                this.batteryLevel -= 10;
                System.out.println("Calling " + name);
            } else {
                System.out.println("Contact not found!");
            }
        }
    }

    @Override
    public String toString() {
        return "MobilePhone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", batteryLevel=" + batteryLevel +
                ", contact1='" + contact1 + '\'' +
                ", contact2='" + contact2 + '\'' +
                '}';
    }
}
