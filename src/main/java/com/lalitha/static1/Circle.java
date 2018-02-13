package com.lalitha.static1;

public class Circle {
    private  float radius;
    public static final float pie =3.14f;
    static{
        System.out.println( pie);
    }
    public Circle(float radius){
        this.radius = radius;
        System.out.println(this.radius);
    }
    public float area(){
        System.out.println("Pie Value "+ Circle.pie);
        Circle.hello();
        return Circle.pie * this.radius * this.radius;
    }
    public float perimeter(){
        return 2 * Circle.pie * this.radius;
    }
    public static void hello(){
        Circle.hello1();
        System.out.println("hello world");
    }
    public static void hello1(){
        System.out.println("welcome to atlanta");
    }
}
