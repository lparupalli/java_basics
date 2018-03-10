package com.lalitha.interfaces;

public class Circle implements TwoDShapes {

    private String shapeName;
    private static float PI = 3.14f;
    private float radius;

    public Circle(String shapeName, float radius){
        this.shapeName= shapeName;
        this.radius= radius;
    }

    public String shapeName(){
        return this.shapeName;
    }
    public float area(){
        return PI * this.radius * this.radius;
    }
    public float perimeter(){
        return 2 * PI * this.radius;
    }

}
