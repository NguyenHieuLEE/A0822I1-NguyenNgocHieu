package ss03_array_method.exercise;
import java.util.Arrays;
import java.util.Scanner;

public class ElementCount {
    public static void main(String[] args) {
        System.out.println("Kí tự vừa nhập xuất hiện "+count()+" lần");
    }
    public static int count() {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        System.out.print("Nhập chuỗi kí tự là số: ");
        String str= scanner.nextLine();
        int m=str.length();
        System.out.println("Số phần tử trong chuỗi là: "+m);
        char[] a = str.toCharArray();
        System.out.println(Arrays.toString(a));
        System.out.print("Nhập phần tử cần đếm ");
        int n = scanner.nextInt();
        for (int i = 0; i < a.length; i++) {
            int temp=Character.getNumericValue(a[i]);
            if (n == temp) {
                count++;
            }
        }
        return count;
    }

}
