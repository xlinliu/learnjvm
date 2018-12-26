package edu.whu.swe.lxl.learn.java;

public class TestAutoBoxing {
    public static void main(String[] args){
        int i=23;
        Long l=Long.valueOf(23);
        Long l2 = 128l;
        Long l3 = 128l;
        Integer i2 = Integer.valueOf(23);
        Integer i3 = new Integer(22)+1;

        System.out.println("i.equals(l) :"+(l3==l2));
        longMethod(3);
    }
    static void intMethod(int a){}
    static void longMethod(long a){}
}
