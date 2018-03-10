package com.lalitha.overLoading;

public class TestClass {
    public static void main(String[] args){
        InterfaceA i= new ClassB();
        System.out.println(i.methodOne());
        System.out.println(((ClassB)i).methodOne( 10));
        ClassA c = new ClassC();
        System.out.println(c.method1());
        System.out.println(((ClassC)c).method1(12));

    }
}
