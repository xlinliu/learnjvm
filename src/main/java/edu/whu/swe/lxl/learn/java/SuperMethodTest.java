package edu.whu.swe.lxl.learn.java;

public class SuperMethodTest {
    public static void main(String[] args ){
        SubClass1 subClass1=new SubSubClass1();
        subClass1.InvokeMethod();
    }
}
class ParentsClass1{
    public void method(){
        System.out.println("method of ParentsClass1");
    }
    public void InvokeMethod(){
        this.method();
    }
}

class SubClass1 extends ParentsClass1{
    @Override
    public void method() {
        System.out.println("method of SubClass1");

    }
    public void InvokeMethod(){
        this.method();
    }
}
class SubSubClass1 extends SubClass1{
    @Override
    public void method() {
        System.out.println("method of SubSubClass1");
    }

}