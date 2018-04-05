package com.lalitha.comparison;

public class Person implements Comparable{
    private String name;
    private int age;
    private int weight;
    public Person(String name, int age, int weight){
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

    public int compareTo(Object temp){
        Person other = (Person)temp;
        if(getAge()>other.getAge()){
            return 1;
        }
        else if(getAge()<other.getAge()){
            return -1;
        }
        else
            return 0;

    }
}
