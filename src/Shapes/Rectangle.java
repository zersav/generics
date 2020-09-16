package Shapes;

public class Rectangle extends Shape {
    private long width;
    private long height;

    public Rectangle(String name, long width, long height){
        super(name);
        this.height=height;
        this.width=width;
    }

    @Override
    public double getArea() {
        return width*height;
    }
}
