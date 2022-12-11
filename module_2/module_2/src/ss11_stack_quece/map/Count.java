package ss11_stack_quece.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        String[] arr = str.split("");
        Map<String, Integer> map = new HashMap<>();

        for(String s: arr){
            if (map.containsKey(s)){
                Integer value = map.get(s);
                value++;
                map.replace(s, value);
            }else {
                map.put(s, 1);
            }
        }
        System.out.println(map.toString());
    }
}