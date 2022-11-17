package ss03_array_method.exercise;
import java.util.Scanner;
public class MaxElementArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[2][2];
        System.out.println("Nhập các phần tử của mảng: ");
        for (int i = 0; i < 2; i++) {
            for(int j=0;j<2;j++) {
                System.out.printf("a[%d][%d] = ", i, j);
                arr[i][j] = scanner.nextInt();
            }
        }
        int max = arr[0][0];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Số lớn nhất trong mảng là: "+max);
    }

}
