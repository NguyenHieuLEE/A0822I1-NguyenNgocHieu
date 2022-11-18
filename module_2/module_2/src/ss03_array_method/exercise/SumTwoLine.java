package ss03_array_method.exercise;

import java.util.Scanner;

public class SumTwoLine {
    public static void main(String[] args) {
        System.out.println("Tổng hai đường chéo là: " + isSum());
    }

    public static int isSum() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số hàng, số cột: ");
        int n = scanner.nextInt();
        System.out.print("số hàng=số cột= " + n);
        System.out.println(" ");
        int[][] arr = new int[n][n];
        System.out.println("Nhập các phần tử của mảng: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("a[%d][%d] = ", i, j);
                arr[i][j] = scanner.nextInt();
            }
        }
        int sum = 0;
        int sum1 = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (i == j) {
                    sum += arr[i][j];
                }
                if (i + j == arr.length - 1 && i != j) {
                    sum1 += arr[i][j];
                }
            }
        }
        return sum + sum1;
    }
}
