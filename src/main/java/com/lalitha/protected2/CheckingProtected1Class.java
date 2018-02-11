package com.lalitha.protected2;

import com.lalitha.protected1.BaseClassOne;

public class CheckingProtected1Class extends BaseClassOne{
    protected void method3(){
        //with inheritance we can access protected method
        this.method1();
        BaseClassOne ob = new BaseClassOne();
        //ob.method1();
    }
}
