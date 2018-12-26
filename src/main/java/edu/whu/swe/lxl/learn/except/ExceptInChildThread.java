package edu.whu.swe.lxl.learn.except;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ExceptInChildThread {
    public static void main(String[] args){

        Lock lock=new ReentrantLock(true);
        Runnable taskRuntimeExcept= new Runnable() {
            @Override
            public void run() {
                lock.lock();
                int[] array = new int[2];
                System.out.println(array[2]);
                lock.unlock();
            }
        };
        Thread threadRuntimeExcept = new Thread(taskRuntimeExcept);
        threadRuntimeExcept.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    lock.lock();
                    System.out.println(i);
                    lock.unlock();
                }
            }
        }).start();
        
    }
}
