package com.lalitha.interfaces;

public class TestCircle {
    public static void main(String[] args){
        TwoDShapes c = new Circle("circle" , 3);
    System.out.println(c.area());
    System.out.println(c.perimeter());
    System.out.println(((Circle)c).shapeName()); //type cast to access methods from child class that are not part of base class

    }
}
