package ss02_loop.exercise.figure;
import java.util.Scanner;
public class IsoscelesTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hight;
        int x, out;
        System.out.printf("\n\nNhập vào chiều cao của tam giac can: ");
        hight = sc.nextInt();
        for (int i = 1; i <= hight; ++i) {
            for (int j = 1; j <= 2*hight; ++j) {
                x=j-hight;
                if(x<0){
                    x*=-1;
                }
                out=i-x;
                if(out>0){
                    System.out.printf("%2d",out);
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println("  ");
        }
        System.out.println("\n----------------------------------");
    }
}
