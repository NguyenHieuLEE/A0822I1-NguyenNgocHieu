package ss02_loop.exercise.figure;

public class triangle2 {
    public static void main(String[] args){
        for(int i=5;i>0;i--){
            for(int j=1;j<=i;j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
