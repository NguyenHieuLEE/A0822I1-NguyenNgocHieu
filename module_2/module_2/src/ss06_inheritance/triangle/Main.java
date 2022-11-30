package ss06_inheritance.triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập cạnh thứ nhất ");
        double size1 = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập cạnh thứ hai ");
        double size2 = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập cạnh thứ ba ");
        double size3 = Double.parseDouble(scanner.nextLine());
        Shape shape=new Shape(size1,size2,size3);
        Triangle triangle=new Triangle();
        System.out.println("Chu vi là: "+triangle.getPerimeter(size1,size2,size3));
        System.out.println("Diện tích là: "+triangle.getArea(size1,size2,size3));
    }
}
