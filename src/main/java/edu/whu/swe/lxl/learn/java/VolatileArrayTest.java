package edu.whu.swe.lxl.learn.java;

import static java.lang.Thread.sleep;

public class VolatileArrayTest {
    public static void main(String[] args) {


        new Thread(() -> {
            SubFlag[] subFlags1=subFlags;
            SubFlag subFlag=subFlags1[0];
            Flag flag=subFlag.getFlag();

            while (flag.isFlag()) {
                System.out.print(flag.getI());
            }
            System.out.print("\n"+System.currentTimeMillis());
        }).start();
        new Thread(() -> {
            try {
                sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            SubFlag subFlag=subFlags[0];
            Flag flag=subFlag.getFlag();

            System.out.print("\n"+System.currentTimeMillis());
            flag.setFlag(false);
            flag.setI(2);
        }).start();
    }


//    public static volatile Flag[] flags = {new Flag(), new Flag(), new Flag()};

    static SubFlag[] subFlags = {new SubFlag(), new SubFlag()};
    static class Flag {
        public boolean flag = true;
        int i=0;
        public int getI() {
            return i;
        }

        public void setI(int i) {
            this.i = i;
        }


        public void setFlag(boolean flag) {
            this.flag = flag;
        }

        public boolean isFlag() {
            return flag;
        }
    }

    static class SubFlag{
        private Flag flag=new Flag();

        public Flag getFlag() {
            return flag;
        }

        public void setFlag(Flag flag) {
            this.flag = flag;
        }
    }


}
