import Shapes.Circle;
import Shapes.Shape;

import java.util.ArrayList;
import java.util.List;

public class MyUtils <T extends Shape> {
    private List <T> shapes; //wildcard
    private String name;

    MyUtils(String name){
        this.name=name;
        shapes= new ArrayList<T>();
    }

    public MyUtils <? extends Shape> addShape(T shape){
        shapes.add(shape);
        return this;
    }

    public List<Double> getAreas(){
        List <Double> areas = new ArrayList<>();
        for (Shape shape:shapes){
            areas.add(shape.getArea());
        }
        return areas;
    }


}
