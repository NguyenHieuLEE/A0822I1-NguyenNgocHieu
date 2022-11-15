package ss01_introduce_java.exercise.currency_converter;
import java.util.Scanner;
public class CurrencyConverter {
    public static void main(String[] args) {
        int number;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap lua chon");
            number = sc.nextInt();
            System.out.println(converter(number));
        }while(number!=1&&number!=2);
    }
    private static float converter(int number) {
        switch (number) {
            // chuyen tu vnd sang usd
            case 1:
                Scanner sc1 = new Scanner(System.in);
                System.out.println("Nhap so tien can chuyen VND");
                float vnd = Float.parseFloat(sc1.nextLine());
                float usd = vnd / 25000;
                return usd;
            // chuyen tu usd sang VND
            case 2:
                Scanner sc2 = new Scanner(System.in);
                System.out.println("Nhap so tien can chuyen USD");
                usd = Float.parseFloat(sc2.nextLine());
                vnd= usd * 25000;
                return vnd;
        }
        return 0;
    }
}
