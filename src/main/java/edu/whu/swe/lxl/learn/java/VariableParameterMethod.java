package edu.whu.swe.lxl.learn.java;

public class VariableParameterMethod {
    public static void main(String[] args){
        method(3);
    }
    public static void method(int a,int ...b){
        for(int e:b) {
            System.out.println(e);
        }
    }
}
