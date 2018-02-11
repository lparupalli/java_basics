package com.lalitha.defualt2;

import com.lalitha.default1.BaseClassOne;

public class CheckingDefaultNewClass {
     void CheckingDefaultNewMethod(){
        BaseClassOne obj = new BaseClassOne();
        //a default method or class caanot access from different package and can only access
        // from same package.
        //obj.baseClassMethod();
    }
}
