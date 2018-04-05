package com.lalitha.checkedException;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class TestClassA {
    public static void main(String[] args) {
        ClassA c = new ClassA();
        try {
            c.methodA();
        }catch(Exception ex){
            if(ex instanceof FileNotFoundException){
                System.out.println("file not found exception");
            }else if(ex instanceof SQLException){
                System.out.println("sql exception");
            }else{
                System.out.println("catch block excuted:   "+ ex.getMessage());
            }

        }
    }
}
