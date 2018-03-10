package com.lalitha.shapesMultilevel;


public class Circle  extends TwoDShapes {

    private  float radius;
    private static float PI = 3.14f;

    public Circle(float radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    public float area() {
        return Circle.PI *this.radius * this.radius;
    }

    @Override
    public float perimeter(){
        return 2 * Circle.PI * this.radius;

    }
}
