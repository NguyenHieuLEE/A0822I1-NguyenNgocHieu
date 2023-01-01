package vehicle.model;

public class Vehicle {
    int seaControl;
    String manufacturerName;
    int year;

    public Vehicle() {
    }

    public Vehicle(int seaControl, String manufacturerName, int year) {
        this.seaControl = seaControl;
        this.manufacturerName = manufacturerName;
        this.year = year;
    }

    public int getSeaControl() {
        return seaControl;
    }

    public void setSeaControl(int seaControl) {
        this.seaControl = seaControl;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
