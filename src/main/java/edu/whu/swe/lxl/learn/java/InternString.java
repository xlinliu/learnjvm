package edu.whu.swe.lxl.learn.java;

public class InternString {
    static String finalString = "12";
    public static void main(String[] args){
        final String str=new String("12");
        String localFinalString = str.toString();
        System.out.print(finalString==str);
    }
}
