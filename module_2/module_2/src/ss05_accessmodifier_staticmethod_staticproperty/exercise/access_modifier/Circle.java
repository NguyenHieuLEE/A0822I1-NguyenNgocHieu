package ss05_accessmodifier_staticmethod_staticproperty.exercise.access_modifier;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }
    public double getArea (){
        return 3.14*this.radius*this.radius;
    }
    public void showResult (){
        System.out.println("Diện tích là ");
        System.out.println(getArea());
    }
}
