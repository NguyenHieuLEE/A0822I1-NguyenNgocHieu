package ss03_array_method.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class InsertElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {10, 4, 6, 7, 8, 0, 0, 0, 0, 0};
        int n,index;
        do {
            System.out.println("Nhập giá trị phần tử cần chèn :");
            n = sc.nextInt();
            System.out.println("Nhập vị trí chèn :");
            index = sc.nextInt();
        } while (index < 0 || index >= (array.length - 1));
        for (int i = 0; i < array.length - 1; i++) {
            if (i == index) {
                for (int j = array.length - 1; j > i; j--) {
                    array[j] = array[j - 1];
                }
                array[index] = n;
            }
        }
        System.out.println("Mảng sau khi chèn phần tử là: ");
        System.out.println(Arrays.toString(array));
    }
}
