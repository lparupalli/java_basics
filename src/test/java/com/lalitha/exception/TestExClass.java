package com.lalitha.exception;

import java.io.FileNotFoundException;

public class TestExClass {

    public static void main(String[] args) {
            ExClass e = new ExClass();
            //String b = e.convertToLowerCase("lalitha");
            //System.out.println(b);
            //System.out.println(e.multiply(2 , 3));
            System.out.println(e.readFileContents("abc.txt"));

    }
}
