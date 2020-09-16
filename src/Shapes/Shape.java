package Shapes;

public abstract class Shape {
    private final String name;

    abstract public double getArea();

    public Shape(String name){
        this.name=name;
    }
}
