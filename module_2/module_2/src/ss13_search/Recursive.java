package ss13_search;
import java.util.Scanner;
public class Recursive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[9];
        System.out.println("Nhập các phần tử của mảng: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("a1[%d] = ", i);
            arr[i] = scanner.nextInt();
        }
        sortASC(arr);
        System.out.println("Dãy số được sắp xếp tăng dần: ");
        show(arr);
        int value;
        System.out.print("\n");
        System.out.println("Nhập các phần tử cần tìm: ");
        value=scanner.nextInt();
        System.out.println("Phần tử cần tìm ở vị trí index = "+binarySearch(arr,value));

    }
        public static void sortASC(int[] arr) {
            int temp = arr[0];
            for (int i = 0 ; i < arr.length - 1; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] > arr[j]) {
                        temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                    }
                }
            }
        }
        public static void show(int [] arr) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
        public static int binarySearch(int[] arr ,int value) {
            int left = 0;
            int right = arr.length - 1;
            while (left <= right) {
                int mid=(right+left/2);
                if(value==arr[mid]) {
                    return mid;
                }
                else if(value<arr[mid]) {
                    right= mid-1;
                }
                else{
                    left=mid-1;
                }

            }
            return -1;
        }


}
