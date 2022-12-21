package ss15_exception;
import java.util.Scanner;
public class DemoException {
    public static void main(String[] args) {
        System.out.println("Bắt đầu");
        Scanner scanner = new Scanner(System.in);
        boolean flag = false;
        do {
            flag=false;
            System.out.println("nhập canh a b c");
            int a =0;
            int b =0;
            int c =0;
            try {
                a = Integer.parseInt(scanner.nextLine());
                b = Integer.parseInt(scanner.nextLine());
                c = Integer.parseInt(scanner.nextLine());
                check(a,b,c);
            }catch (IllegalTriangleException aExeption) {
                flag=true;
                aExeption.printStackTrace();
                System.out.println("nhập sai cạnh ");
            }catch (NumberFormatException e){
                flag=true;
                e.printStackTrace();
                System.out.println("đang nhập chữ");
            }
        }while (flag);
        System.out.println("Kết thúc");
    }
    public static void check(int a,int b,int c) throws IllegalTriangleException{
        if (a<0||b<0||c<0||a+b < c||a+c < b||b+c < a) {
            throw  new IllegalTriangleException("Nhập sai");
        }
    }
}
