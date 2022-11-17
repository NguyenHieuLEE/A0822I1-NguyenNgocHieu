package ss03_array_method.exercise;

import java.util.Scanner;

public class SumElementCol {
    public static void main(String[] args) {
        System.out.println("Tổng một cột là: " + Sum());
    }
    public static int Sum() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số hàng:  ");
        int n = scanner.nextInt();
        System.out.print("Nhập số cột:  ");
        int m = scanner.nextInt();
        System.out.println("số hàng" + n);
        System.out.print("số cột" + m);
        System.out.println(" ");
        int[][] arr = new int[n][m];
        System.out.println("Nhập các phần tử của mảng: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("a[%d][%d] = ", i, j);
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.print("Nhập cột cần tính:  ");
        int col = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (j == col-1) {
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }
}
