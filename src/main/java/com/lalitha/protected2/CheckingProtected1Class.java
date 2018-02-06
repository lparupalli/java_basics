package com.lalitha.protected2;

import com.lalitha.protected1.BaseClassOne;

public class CheckingProtected1Class extends BaseClassOne{
    protected void method3(){
        BaseClassOne ob = new BaseClassOne();
        this.method1();
    }
}
