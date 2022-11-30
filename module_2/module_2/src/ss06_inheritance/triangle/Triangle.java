package ss06_inheritance.triangle;

public class Triangle extends Shape{

    public Triangle() {
    }
    public double getPerimeter(double size1,double size2,double size3){
        return size1+size2+size3;
    }
    public double getArea(double size1,double size2,double size3){
        double circumference=(size1+size2+size3)/2;
        return Math.sqrt(circumference*(circumference-size1)*(circumference-size2)*(circumference-size3));
    }
}
