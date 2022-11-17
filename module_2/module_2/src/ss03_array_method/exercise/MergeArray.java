package ss03_array_method.exercise;
import java.util.Scanner;
public class MergeArray {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int [] arr1 = new int [3];
        int [] arr2 = new int [3];
        System.out.println("Nhập các phần tử của mảng: ");
        for (int i = 0; i <arr1.length ; i++) {
            System.out.printf("a1[%d] = ", i);
            arr1[i] = scanner.nextInt();
        }
        System.out.println("Nhập các phần tử của mảng: ");
        for (int i = 0; i <arr2.length ; i++) {
            System.out.printf("a2[%d] = ", i);
            arr2[i] = scanner.nextInt();
        }
        int[] arr3=new int[6];
        for(int i=0;i<arr1.length;i++){
            arr3[i]=arr1[i];
        }
        for(int i=0;i<arr2.length;i++){
            arr3[i+3]+=arr2[i];
        }
        System.out.println("Mảng sau khi gộp:");
        for (int i = 0; i < 6; i++) {
            System.out.print(arr3[i] + "\t");
        }
    }
}
