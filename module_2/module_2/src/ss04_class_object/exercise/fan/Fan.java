package ss04_class_object.exercise.fan;
public class Fan  {
    public static int SLOW = 1;
    public static int MEDIUM = 2;
    public static int FAST = 3;

    private int speed;
    private boolean on;
    private double radius;
    private String color;

    Fan() {
        this.speed = SLOW;
        this.on = false;
        this.radius = 5.0;
        this.color = "blue";
    }

    Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        if (this.on) {
            return "Fan is on, speed : " + this.speed + ", color : " + this.color + ", radius : " + this.radius;
        } else {
            return "Fan is off,  color : " + this.color + ", radius : " + this.radius;
        }
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan(FAST,true,10.0,"yellow");
        System.out.println(fan1);
        Fan fan2 = new Fan(MEDIUM,false,5.0,"blue ");
        System.out.println(fan2);
    }
}
