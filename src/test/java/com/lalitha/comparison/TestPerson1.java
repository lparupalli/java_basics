package com.lalitha.comparison;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TestPerson1 {
    public static void main(String[] args){
        ArrayList <Person1> ar = new ArrayList<Person1>();
        ar.add(new Person1("AAA",10,23));
        ar.add(new Person1("xxxx",12,24));
        ar.add(new Person1("JJJ",11,23));
        ar.add(new Person1("MMM",19,24));
        System.out.println("unsorted");
        for(int i=0;i<ar.size();i++) {
            System.out.println(ar.get(i));
        }
        Collections.sort(ar, new AgeComparator());
        System.out.println("sorted by age");
        for(int i =0; i<ar.size();i++){
            System.out.println(ar.get(i));
        }
        Collections.sort(ar, new NameComparator());
        System.out.println("sorted by name");
        for(int i =0;i<ar.size();i++){
            System.out.println(ar.get(i));
        }
    }
}
