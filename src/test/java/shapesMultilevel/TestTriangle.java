package shapesMultilevel;
import com.lalitha.shapesMultilevel.TwoDShapes;
import com.lalitha.shapesMultilevel.Polygon;
import com.lalitha.shapesMultilevel.Triangle;

public class TestTriangle {
    public static void main(String[] args){
        Triangle t= new Triangle(2,3,4,5);
        System.out.println(t.getShapeName());
        System.out.println("The triangle area is:" + t.area());
        System.out.println("The triangle perimeter is:" + t.perimeter());

    }
}
