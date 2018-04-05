package com.lalitha.Generics;

public class TestGenericClass {
    public static void main(String[] args){
        GenericClass<Integer> g1 = new GenericClass<Integer>(10);
        System.out.println(g1.getObj());
        GenericClass<String> g2 = new GenericClass<String>("Generics");
        System.out.println(g2.getObj());
    }

}
