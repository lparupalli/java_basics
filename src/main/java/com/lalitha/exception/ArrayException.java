package com.lalitha.exception;

public class ArrayException {

    public int[] arr = new int[4];

    public void method1() {
        try {
            int i = arr[4];

            System.out.println("Inside try block");

        } catch (ArrayIndexOutOfBoundsException ex) {

            System.out.println("Exception caught in catch block");
        } finally {
            System.out.println("finally block executed");
        }

        System.out.println("out side try-catch-finally block executed");
    }
}
