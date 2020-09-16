import Shapes.Shape;

import java.util.*;

public class MyUtils <T extends Shape> {
    private List <T> shapes; //wildcard
    private String name;

    MyUtils(String name){
        this.name=name;
        shapes= new ArrayList<T>();
    }

    public MyUtils addShape(T shape){
        shapes.add(shape);
        return this;
    }

    public List<? extends Shape> maxAreas(){
        T temp_var= Collections.max(shapes, (o1, o2) -> {
            if (o1.getArea()>o2.getArea()) return 1;
            if (o1.getArea()>o2.getArea()) return -1;
            return 0;
        });

        List<T> temp_list = new ArrayList<>();
        temp_list.add(temp_var);
        return temp_list;
    }


}
