package edu.whu.swe.lxl.learn.java;

public class BeforeSubthreadTest {
    public static void main(String[] args){
        int _1M=1024*1024;
        int _1G=1024*_1M;
        int j=1;
        byte[] bytes1 = new byte[2 * _1G];
        byte[] bytes2 = new byte[2 * _1G];
        byte[] bytes3 = new byte[2 * _1G];

        while (true)
            bytes1[1]=13;
    }
}
