package com.lalitha.comparison;

import java.util.Objects;

public class Equals {
    private int a;
    private String b;

    public Equals(int a, String b){
        this.a = a;
        this.b = b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Equals)) return false;

        Equals equals = (Equals) o;

        if (a != equals.a) return false;
        return b.equals(equals.b);
    }

    @Override
    public int hashCode() {
        int result = a;
        result = 31 * result + b.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Equals{" +
                "a=" + a +
                ", b='" + b + '\'' +
                '}';
    }

    //    @Override
//    public boolean equals(Object obj) {
//        if (obj == null){
//            return false;
//        }else if (obj instanceof Equals){
//            if(this == obj){
//                return true;
//            }else{
//                Equals other =(Equals)obj;
//                if(this.a == other.a){
//                    if(this.b != null){
//                        return this.b.equals(other.b);
//                    }else if(this.b == other.b){
//                        return true;
//                    }else if(other.b != null){
//                        return other.b.equals(this.b);
//                    }
//                    return false;
//
//                }
//                return false;
//            }
//        }
//        return false;
//    }
}
