package vehicle.model;

public class Car extends Vehicle{
    int seats;
    String type;
    public Car() {
    }

    public Car(int seats, String type) {
        this.seats = seats;
        this.type = type;
    }

    public Car(int seaControl, String manufacturerName, int year, int seats, String type) {
        super(seaControl, manufacturerName, year);
        this.seats = seats;
        this.type = type;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Car{" +
                "seaControl=" + seaControl +
                ", manufacturerName='" + manufacturerName + '\'' +
                ", year=" + year +
                ", seats=" + seats +
                ", type='" + type + '\'' +
                '}';
    }
}
