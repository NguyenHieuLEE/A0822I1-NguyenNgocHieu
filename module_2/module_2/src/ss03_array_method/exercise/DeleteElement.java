package ss03_array_method.exercise;
import java.util.Scanner;
public class DeleteElement {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int i,c;
        int[] array1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("nhập phần tử cần xoá: ");
        int k=scanner.nextInt();
        for (c = i = 0; i < 10; i++) {
            if (array1[i] != k) {
                array1[c] = array1[i];
                c++;
            }
        }
        System.out.println("Mảng còn lại sau khi xóa phần tử " + k + " là: ");
        for (i = 0; i < 9; i++) {
            System.out.print(array1[i] + "\t");
        }
    }
}
