package com.lalitha.Generics;

public class TestMultipleParameters {
    public static void main(String[] args){
        MultipleParameters <String , Integer> m1 = new MultipleParameters<String, Integer>("GENERICS", 10);
        System.out.println(m1.getObj1());
        System.out.println(m1.getObj2());
    }
}
