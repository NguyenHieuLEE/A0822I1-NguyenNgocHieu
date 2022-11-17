package ss03_array_method.exercise;

import java.util.Scanner;

public class InsertElement {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int i;
        int[] array1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("nhập phần tử cần chèn: ");
        int k = scanner.nextInt();
        System.out.println("nhập vị trí chèn phần tử : ");
        int index = scanner.nextInt();
        for (i = 0; i < 10; i++) {
            if(index<=1&&index>=9){
                System.out.println("không chèn phần tử vào được ");
            }else{
                array1=insert(array1,k);
            }
        }
        System.out.println("Mảng còn lại sau khi chèn phần tử " + k + " là: ");
        for (i = 0; i < 11; i++) {
            System.out.print(array1[i] + "\t");
        }
    }
    public static int [] insert(int [] array1, int k) {
        int index = array1.length - 1;
        int tempIndex = array1.length;
        int [] tempArr = new int [tempIndex + 1];
        boolean inserted = false;

        for (int i = tempIndex; i >= 0; i--) {
            if (index > -1 && array1[index] > k) {
                tempArr[i] = array1[index--];
            } else {
                if (!inserted) {
                    tempArr[i] = k;
                    inserted = true;
                } else {
                    tempArr[i] = array1[index--];
                }
            }
        }
        return tempArr;
    }

}
