package gokul.June.jun22;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;

public class Lists {
    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>();
        int i = 0;
        while(i<400)
            a.add(i++);

        int parallelism = ForkJoinPool.getCommonPoolParallelism();
        System.out.println("Parallelism level: " + parallelism);


        //will take 40 seconds
//        a.parallelStream().forEach(a1->{
//            try {
//                Thread.sleep(500);
//                System.out.println(a1);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        });

        //below will take 200 seconds
//        a.forEach(a1->{
//            try {
//                Thread.sleep(500);
//                System.out.println(a1);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        });


    }
}
