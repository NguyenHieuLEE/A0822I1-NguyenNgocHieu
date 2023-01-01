package vehicle.model;

public class Motor extends Vehicle{
    int wat;

    public Motor(int wat) {
        this.wat = wat;
    }

    public int getWat() {
        return wat;
    }

    public void setWat(int wat) {
        this.wat = wat;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "seaControl=" + seaControl +
                ", manufacturerName='" + manufacturerName + '\'' +
                ", year=" + year  +
                ", wat=" + wat +
                '}';
    }
}
