package com.lalitha.static1;

public class CircleTest {
    public static void main(String[] args){
        Circle c1 = new Circle(2);
        Circle c2 = new Circle(3);
        //c1.pie  = 4.14f;
        float a = c1.area();
        //Circle.pie = 4.14f;
        float b =  c2.area();
        System.out.println(a);
        System.out.println(b);
    }
}
