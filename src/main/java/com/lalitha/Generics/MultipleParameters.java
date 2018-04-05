package com.lalitha.Generics;

public class MultipleParameters<M ,N> {
    private M obj1;
    private N obj2;

    public MultipleParameters(M obj1, N obj2){
        this.obj1 = obj1;
        this.obj2 = obj2;

    }
    public M getObj1() {
        return obj1;
    }

    public N getObj2() {
        return obj2;
    }
}
