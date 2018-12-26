package edu.whu.swe.lxl.learn.java;

public class GetFiledTest {
    static class InnerClass{
        int a=1;
    }
    public static void main(String[] args){
        InnerClass innerClass=new InnerClass();
        int b=innerClass.a;
    }
}
