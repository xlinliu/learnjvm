package edu.whu.swe.lxl.learn.java;

import java.util.ArrayList;

public class InvokeDynamicTest {

    public void testInvokeDynamic(){
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.sort(Integer::compareTo);

    }
}
