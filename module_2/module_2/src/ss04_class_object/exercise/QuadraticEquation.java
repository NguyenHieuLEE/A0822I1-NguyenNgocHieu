package ss04_class_object.exercise;

import java.util.Scanner;

public class QuadraticEquation{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a: ");
        int a=scanner.nextInt();
        System.out.println("Nhập b: ");
        int b=scanner.nextInt();
        System.out.println("Nhập c: ");
        int c=scanner.nextInt();
        float delta=b*b-4*a*c;
        if(delta<0){
            System.out.println("Phương trình vô nghiệm");
        }
        if(delta==0){
            float root=-b/(2*a);
            System.out.println("Phương trình có nghiệm kép: "+root);
        }
        if(delta>0){
            double root1=(-b+Math.pow(delta,0.5))/(2*a);
            double root2=(-b-Math.pow(delta,0.5))/(2*a);
            System.out.println("Phương trình có 2 nghiệm phân biệt: ");
            System.out.println("Nghiệm thứ 1: "+root1);
            System.out.println("Nghiệm thứ 2: "+root2);
        }

    }
}
