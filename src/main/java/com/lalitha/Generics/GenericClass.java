package com.lalitha.Generics;

public class GenericClass<G> {
    private G obj;
    public GenericClass(G obj){
        this.obj = obj;
    }

    public G getObj() {
        return obj;
    }

    public void setObj(G obj) {
        this.obj = obj;
    }
}
