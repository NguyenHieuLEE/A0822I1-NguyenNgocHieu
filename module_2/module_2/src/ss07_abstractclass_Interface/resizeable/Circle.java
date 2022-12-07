package ss07_abstractclass_Interface.resizeable;

public class Circle {
    double radius =0.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double setArea(){
        return radius*radius*3.14;
    }
}
