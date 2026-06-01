package lesson_six;

public class BikeRental {
    private String bikeType;
    private double hourlyRate;
    private boolean availability;
    private String renterName;

    public String getBikeType() {
        return bikeType;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public boolean isAvailability() {
        return availability;
    }

    public String getRenterName() {
        return renterName;
    }

    public void setBikeType(String bikeType) {
        if (bikeType.equals("Mountain") || bikeType.equals("Road") || bikeType.equals("Electric")) {
            this.bikeType = bikeType;
        } else {
            System.out.println("Invalid bike type");
        }
    }

    public void setHourlyRate(double hourlyRate) {
        if (hourlyRate >= 0) {
            this.hourlyRate = hourlyRate;
        } else {
            System.out.println("Invalid hourly rate");
        }
    }

    public BikeRental(String bikeType, double hourlyRate, boolean availability, String renterName) {
        this.bikeType = bikeType;
        this.hourlyRate = hourlyRate;
        this.availability = availability;
        this.renterName = renterName;
    }

    public BikeRental(String bikeType) {
        this.bikeType = bikeType;
        this.hourlyRate = 5.0;
        this.availability = true;
    }

    public void rentBike(String name) {
        if (availability) {
            availability = false;
            this.renterName = name;
            System.out.println("Bike rented successfully to " + name);
        } else {
            System.out.println("Sorry, this bike is currently unavailable.");
        }
    }

    public void returnBike(String name) {
        if (renterName.equals(name)) {
            availability = true;
            this.renterName = renterName;
        } else {
            System.out.println("Bike is already free.");
        }
    }
}
