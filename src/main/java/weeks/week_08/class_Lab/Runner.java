package weeks.week_08.class_Lab;

import java.util.Arrays;

public class Runner {

    public static void main(String[] args) {

        Shape square = new Shape();
        square.setSquareInfo(3,12, 34, false);
        square.saveShape();

        Shape circle = new Shape();
        circle.setCircleInfo(3,12,34,false);
        circle.saveShape();

        Shape dot = new Shape();
        dot.setDotInfo(12,34, false);
        dot.saveShape();

        //square.deleteShape();
        System.out.println(square.getShapeById());
    }
}
