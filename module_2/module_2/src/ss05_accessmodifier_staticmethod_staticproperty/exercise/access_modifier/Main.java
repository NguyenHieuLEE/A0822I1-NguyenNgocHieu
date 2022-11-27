package ss05_accessmodifier_staticmethod_staticproperty.exercise.access_modifier;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập r ");
        double r = Double.parseDouble(scanner.nextLine());
        Circle Circle = new Circle(r,"blue");
        Circle.showResult();
    }
}
