package edu.whu.swe.lxl.learn.java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String args[]) {
        Main1 main = new Main1();
    }
}

class Main1 {

    public Main1() {
        System.out.println("construction of Main1!");
    }

    static {
        System.out.println("static block before attribute");
    }
    {System.out.println("instance block before attribute");}
    public  final MyClass myClass = new MyClass("common");
    public static final MyClass static_final_myClass = new MyClass("static final");
    public  final MyClass final_myClass = new MyClass(" final");
    {System.out.println("instance block after attribute");}


    static {
        System.out.println("static block after attribute");
    }

}

class MyClass {
    public MyClass(String type) {
        System.out.println("construction of MyClass "+type+" attribute");
    }
}


