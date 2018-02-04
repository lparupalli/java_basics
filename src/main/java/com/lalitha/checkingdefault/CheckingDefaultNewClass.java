package com.lalitha.checkingdefault;

import com.lalitha.defaultmodifier.BaseClassOne;

public class CheckingDefaultNewClass {
    public void CheckingDefaultNewMethod(){
        BaseClassOne obj = new BaseClassOne();
        //a default method or class caanot access from different package and can only access
        // from same package.
        //obj.baseClassMethod();
    }
}
