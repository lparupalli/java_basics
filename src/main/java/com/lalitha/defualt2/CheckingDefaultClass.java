package com.lalitha.defualt2;

import com.lalitha.default1.BaseClassOne;

public class CheckingDefaultClass extends BaseClassOne{
    public void checkingMethod(){
        //if the method has defalut accsess scope then even with inheritance it cannot
        // be accessed in a class under different package.
        //this.baseClassMethod();
    }
}
