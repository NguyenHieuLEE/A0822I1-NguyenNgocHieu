package ss06_inheritance.circle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r;
        String color;
        System.out.println("Enter r: ");
        System.out.print("r = ");
        r = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter color: ");
        System.out.print("color = ");
        color = scanner.nextLine();
        Circle circle=new Circle(r,color);
        System.out.println("Area is: "+circle.Area(r));
    }
}
