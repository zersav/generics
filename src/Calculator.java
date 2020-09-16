import Shapes.Circle;
import Shapes.Rectangle;
import Shapes.Shape;

import java.awt.*;

public class Calculator {
    public static void main(String[] args) {
        MyUtils <Shape> myUtils = new MyUtils<>("utill");

        myUtils.addShape(new Circle("circle 1",11))
                .addShape(new Circle("circle 2", 23))
                .addShape(new Rectangle("rectangle 1", 10, 4))
                .addShape(new Rectangle("rectangle 2", 11 ,2));


        for (Shape shape: myUtils.maxAreas()){
            System.out.println(shape.getArea());
        }


    }
}
