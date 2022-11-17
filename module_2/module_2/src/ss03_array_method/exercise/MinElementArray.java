package ss03_array_method.exercise;
import java.util.Scanner;
public class MinElementArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[3];
        System.out.println("Nhập các phần tử của mảng: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = scanner.nextInt();

        }
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Số nhỏ nhất trong mảng là: "+min);
    }
}
