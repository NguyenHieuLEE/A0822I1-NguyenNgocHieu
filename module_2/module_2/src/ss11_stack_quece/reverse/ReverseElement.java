package ss11_stack_quece.reverse;
import java.util.Stack;
public class ReverseElement {
    public static void main(String[] args) {
        Stack<Integer> stacks = new Stack<>();
        int[] arr = {1, 2, 3, 4, 5};
        for(int i=0;i<arr.length;i++) {
            System.out.println(stacks.push(arr[i]));
        }
        int num =stacks.size();
        for(int j=0;j<num;j++){
            System.out.print(stacks.pop());
        }
    }

}
