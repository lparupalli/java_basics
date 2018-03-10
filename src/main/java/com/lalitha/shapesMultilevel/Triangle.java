package com.lalitha.shapesMultilevel;

public class Triangle extends Polygon {

    private float height;
    private float sideA;
    private float sideB;
    private float base;

    public Triangle(float base, float sideA, float sideB,float height){
        super("Triangle");
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
        this.base = base;

    }

    @Override
    public float area(){
        return 0.5f * this.base *  this.height;
    }
    @Override
    public float perimeter(){
        return this.sideA + this.base + this.sideB;
    }

}

