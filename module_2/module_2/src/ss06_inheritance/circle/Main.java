package ss06_inheritance.circle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r,height;
        String color;
        System.out.println("Enter r: ");
        System.out.print("r = ");
        r = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter color: ");
        System.out.print("color = ");
        color = scanner.nextLine();
        System.out.println("Enter height: ");
        System.out.print("height = ");
        height = Double.parseDouble(scanner.nextLine());
        Circle circle=new Circle(r,color);
        Cylinder cilynder =new Cylinder(r,color,height);
        System.out.println("Area is: "+circle.Area());
        System.out.println("Volunme is: "+cilynder.getVolume());
    }
}
