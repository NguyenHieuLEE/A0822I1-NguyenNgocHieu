package ss06_inheritance.circle;

public class Circle {
    double r;
    String color;
    public Circle() { }
    public  Circle(double r, String color) {
        this.r = r;
        this.color = color;
    }

    public double getR() {
        return r;
    }

    public String getColor() {
        return color;
    }

    public void setR(double r) {
        this.r = r;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double Area(){
        return 3.14*r*r;
    }
}
