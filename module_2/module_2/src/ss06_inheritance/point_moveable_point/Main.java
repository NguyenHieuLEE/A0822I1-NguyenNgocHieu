package ss06_inheritance.point_moveable_point;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(1, 2);
        MoveablePoint moveablePoint = new MoveablePoint(2, 3, 3, 4);
        System.out.println(point);
        System.out.println(moveablePoint);
        System.out.println(Arrays.toString(moveablePoint.move(1,2,3,4)));
    }
}
