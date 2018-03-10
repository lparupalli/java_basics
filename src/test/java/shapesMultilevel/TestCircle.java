package shapesMultilevel;

import com.lalitha.shapesMultilevel.Circle;
import com.lalitha.shapesMultilevel.TwoDShapes;

public class TestCircle {
    public static void main(String[] args){
        TwoDShapes c = new Circle(3);
        c.setShapeName("Circle shape");
        String shapeName =  c.getShapeName();
        System.out.println("Shape name is: " +  shapeName);

        System.out.println("area is : " + c.area());
        System.out.println("perimeter is: "+ c.perimeter());
    }
}
