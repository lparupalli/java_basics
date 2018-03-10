package com.lalitha.exception;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExClass {

    public String convertToLowerCase(String message){
        if (message == null){
            throw new InvalidInputException("input to this method is null");
        }
        return message.toLowerCase();
    }
    public int multiply(int a , int b){
        try{

        }finally {
            System.out.println("first try");
        }
        try{
            //throw new InvalidInputException("try block");
            //return a * b;
            try{
                System.out.println("try in  try");
            }finally{
               return 11;
            }
        }finally{
            return 10;
        }

    }
    public String readFileContents(String fileName){
        try {
            File file = new File(fileName);
            FileInputStream fileInputStream = new FileInputStream(file);
        }catch(FileNotFoundException e) {
            System.out.println("caught file not found exception");
            throw new InvalidInputException(e);
        }finally{
            System.out.println("executing finally block");
        }
        return "Sample Data";
    }

}
