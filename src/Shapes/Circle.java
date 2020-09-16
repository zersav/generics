package Shapes;

import static java.lang.Math.PI;

public class Circle extends Shape{
    private final double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius=radius;
    }

    @Override
    public double getArea() {
        return PI*radius*radius;
    }
}
