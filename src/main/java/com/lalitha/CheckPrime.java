package com.lalitha;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class CheckPrime {
    private static int temp;
    private boolean isPrime = true;
        public static boolean isPrime ( int num){
        for (int i = 2; i <= num / 2; i++) {
            temp = num % i;
            if (temp == 0) {
                return false;
            }
        }
        return true;
    }
        public static void main (String[]args)throws Exception {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader buf = new BufferedReader(isr);
            System.out.println("Enter a number");
            String str = buf.readLine();
            int num = Integer.parseInt(str);
            if (isPrime(num)) {
                System.out.println(num + "is a prime number");
            } else
                System.out.println(num + "is not a prime number");

    }
    }
