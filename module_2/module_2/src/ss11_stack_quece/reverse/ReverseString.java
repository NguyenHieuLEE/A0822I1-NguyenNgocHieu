package ss11_stack_quece.reverse;
import java.util.Stack;
public class ReverseString{
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        String str= "Code Gym";
        String[] a=str.split("");
        for(int i=0;i<a.length;i++) {
            System.out.print(stack.push(a[i]));
        }
        System.out.print("\n");
        for (int j = 0; j < a.length; j++) {
            System.out.print(stack.pop());
        }
    }
}
