package edu.whu.swe.lxl.learnjvm.gc;

import java.util.ArrayList;
import java.util.List;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
public class FrequentGC {
    public static void main(String[] args){
        allocateMemory();
        try{
            System.out.print("******************************************");
            Thread.sleep(1000000);
        }catch (Exception e){

        }



//                List<GarbageCollectorMXBean> l = ManagementFactory.getGarbageCollectorMXBeans();
//                for(GarbageCollectorMXBean b : l) {
//                    System.out.println(b.getName());
//                }


    }
    public static void allocateMemory(){
        List<byte[]> list = new ArrayList<byte[]>();
        int size=1024*1024*480;
        int len=size/(20*1024);
        for(int i=0;i<len;i++){
            try {
            byte[] bytes = new byte[20 * 1024];
            list.add(bytes);
            }catch (OutOfMemoryError e){
                e.printStackTrace();

            }

        }
    }

}
