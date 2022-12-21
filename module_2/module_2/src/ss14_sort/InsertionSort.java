package ss14_sort;
import java.util.Arrays;
import java.util.Scanner;
public class InsertionSort {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int [] arr = new int [5];
        System.out.println("Nhập các phần tử của mảng: ");
        for (int i = 0; i <arr.length ; i++) {
            System.out.printf("a1[%d] = ", i);
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Mảng ban đầu:");
        printArray(arr);
        InsertionSort ob = new InsertionSort();
        ob.sort(arr);
        System.out.println("Mảng sau khi sắp xếp:");
        printArray(arr);
    }
    public static void sort(int arr[]) {

            int n = arr.length;
            for (int i = 1; i < n; ++i) {
                int key = arr[i];
                int j = i - 1;
                while (j >= 0 && arr[j] > key) {
                    arr[j + 1] = arr[j];
                    j = j - 1;
                }
                arr[j + 1] = key;
                System.out.println("Lần thứ "+i + ":"+ Arrays.toString(arr));
            }
        }
        public static void printArray(int arr[]) {
            int n = arr.length;
            for (int i = 0; i < n; ++i)
                System.out.print(arr[i] + " ");

            System.out.println();
        }

    }
