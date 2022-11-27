package ss04_class_object.exercise.quadratic_equation;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c;
        System.out.println("Nhập a, b, c: ");
        System.out.print("a = ");
        a = Double.parseDouble(scanner.nextLine());
        System.out.print("b = ");
        b = Double.parseDouble(scanner.nextLine());
        System.out.print("c = ");
        c = Double.parseDouble(scanner.nextLine());
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if (quadraticEquation.getDiscriminant() > 0) {
            System.out.println("Phương trìh cs hai nghẹm phân biệt");
            System.out.print("nghiệm thứ nhất = " + quadraticEquation.getRoot1(quadraticEquation.getDiscriminant()) + "\t");
            System.out.print("nghiệm thứ 2 = " + quadraticEquation.getRoot2(quadraticEquation.getDiscriminant()) + "\t");
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("phương trình có nghiẹm kép");
            System.out.println("Root: " + quadraticEquation.getRoot1(quadraticEquation.getDiscriminant()));
        } else {
            System.out.println("Phương trinhg vô nghiệm");
        }
    }
}
