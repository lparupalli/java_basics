package com.lalitha.comparison;

import java.util.Comparator;

public class Person1 {
    private String name;
    private int age;
    private int weight;
    public Person1(String name, int age, int weight){
        this.name = name;
        this.age = age;
        this.weight= weight;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {

        return age;
    }
    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
class AgeComparator implements Comparator<Person1>{
    public int compare(Person1 a, Person1 b){
        return a.getAge() - b.getAge();

    }

}
class NameComparator implements Comparator<Person1>{
    public int compare(Person1 a, Person1 b){
        return a.getName().compareTo(b.getName());
    }
}

