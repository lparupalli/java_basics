package com.lalitha.protected2;

import com.lalitha.protected1.BaseClassOne;

public class CheckingProtected1Class extends BaseClassOne{
    protected void method3(){
        this.method1();
        CheckingProtected1Class obj = new CheckingProtected1Class();
        BaseClassOne ob = new BaseClassOne();
        obj.method1();
    }
}
