package edu.whu.swe.lxl.learn.java;

public class StaticInheritTest {
    public static void main(String[] args ){
        SubClass.staticField=3;
    }
}

class ParentsClass{
    public static int staticField;
    public static void staticMethod(){};
}

class SubClass extends ParentsClass{

}
