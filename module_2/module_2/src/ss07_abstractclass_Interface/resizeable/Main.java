package ss07_abstractclass_Interface.resizeable;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3.0);
        System.out.println("Diện tích hình tròn: "+circle.setArea());
        Rectangle rectangle = new Rectangle(2,3);
        ((Rectangle) rectangle ).resize(50);
        System.out.println("Diện tích hình chữ nhật là: "+rectangle.setArea2());
        Square square = new Square(4);
        System.out.println("Diện tích hình  vuông: "+square.setArea3());

    }
}
