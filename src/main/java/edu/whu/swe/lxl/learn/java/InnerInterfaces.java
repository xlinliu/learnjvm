package edu.whu.swe.lxl.learn.java;

import java.io.Serializable;
import java.util.ArrayList;

public class InnerInterfaces {
   static int A=4;

    public static void main(String[] args){
        InnerInterfaces innerInterfaces=new InnerInterfaces();

        System.out.println(SubClass.A);
        SuperClass subclass=new SubClass();
        subclass.method2();
        int[] a={1,3};
        for(int i:a){

        }
    }
    interface Interface1{
    }
   public interface Interface2 extends Interface1{
    }
    static public class SuperClass{
        static int A=6;
        public void method1(){

        }
        public void method2(){
            this.method1();
        }
        static {
            System.out.println("SuperClass is static initialed");
        }

        static  void finalStaticMethod(){}
    }
    public static class SubClass extends SuperClass{
        static {
            System.out.println("SubClass is static initialed");
        }

        @Override
        public void method1() {
            super.method1();
            System.out.println("method1 of subclass");
        }

        /**
         * 企图用实例方法覆盖静态方法，报错
         */
        //void finalStaticMethod(){}

    }
}
