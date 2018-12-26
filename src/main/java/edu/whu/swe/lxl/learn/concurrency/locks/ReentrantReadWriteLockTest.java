package edu.whu.swe.lxl.learn.concurrency.locks;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * 这里可以看到，readLock线程之间是会有交叉的，但是writeLock线程是不可能与任何其他线程交叉的
 */
public class ReentrantReadWriteLockTest {
    private ReadWriteLock rwlock = new ReentrantReadWriteLock();

    public static void main(String[] args) {
        final ReentrantReadWriteLockTest reentrantReadWriteLockTest = new ReentrantReadWriteLockTest();
        Thread rtask1 = new Thread(() -> {
            reentrantReadWriteLockTest.read1();
        });
        Thread rtask2 = new Thread(() -> {

            reentrantReadWriteLockTest.read2();
        });
        Thread wtask1 = new Thread(() -> {

            reentrantReadWriteLockTest.write1();
        });
        Thread wtask2 = new Thread(() -> {
            reentrantReadWriteLockTest.write2();
        });
        wtask1.start();
        rtask1.start();
        rtask2.start();

        wtask2.start();

    }

    public void read1() {
        rwlock.readLock().lock();
        try {
            for (int i = 0; i < 100; i++) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("read 1");
            }
        } finally {
            rwlock.readLock().unlock();
        }
    }

    public void read2() {
        rwlock.readLock().lock();
        try {
            for (int i = 0; i < 100; i++) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("read 2");
            }
        } finally {
            rwlock.readLock().unlock();
        }
    }

    public void write1() {
        rwlock.writeLock().lock();
        try {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("write 1");
            }
        } finally {
            rwlock.writeLock().unlock();
        }
    }

    public void write2() {
        rwlock.writeLock().lock();
        try {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("write 2");
            }
        } finally {
            rwlock.writeLock().unlock();
        }
    }
}
