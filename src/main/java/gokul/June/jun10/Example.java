package gokul.June.jun10;

public class Example implements Runnable {
    private  int counter = 0;

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            increment();
        }
    }

    public void increment() {
        counter++;
    }

    public int getCounter() {
        return counter;
    }

    public static void main(String[] args) throws InterruptedException {
        Example example = new Example();
        int threadCount = 5;
        Thread[] threads = new Thread[threadCount];

        // Create and start multiple threads
        for (int i = 0; i < threadCount; i++) {
            threads[i] = new Thread(example);
            threads[i].start();
        }

        threads[0].join();
        threads[1].join();
        threads[2].join();
        threads[3].join();
        threads[4].join();
//        for (int i = 0; i < 5; i++) {
//        example.run();
//        }
        System.out.println(example.getCounter());
    }
}
