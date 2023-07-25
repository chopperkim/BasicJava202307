package chapter06.exercise;

public class Plane {
    private static int numberOfPlanes;
    private String manufacturer;
    private String model;
    private int maxNumberOfPassengers;

    public Plane() {
        this(null, null, 0);
    }

    public Plane(String manufacturer, String model, int maxNumberOfPassengers) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.maxNumberOfPassengers = maxNumberOfPassengers;
        numberOfPlanes++;
    }

    public static int getNumberOfPlanes() {
        return numberOfPlanes;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxNumberOfPassengers() {
        return maxNumberOfPassengers;
    }

    public void setMaxNumberOfPassengers(int maxNumberOfPassengers) {
        if (maxNumberOfPassengers > 0) {
            this.maxNumberOfPassengers = maxNumberOfPassengers;
        }
    }
}
