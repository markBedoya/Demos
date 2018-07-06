public class Synchro {
    public static void main (String[] args) {
        //create and start 2 threads
        //should print 10,000 total
        //each thread printing 5000 times
        
        Count c = new Count();
        Runnable job = new TestRunnable(c);

        Thread t1 = new Thread(job);
        Thread t2 = new Thread(job);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException ex) {
            ex.getMessage();
        }

        System.out.println("Count = " + c.count);
    }
}

class Count {
    int count;

    //public void increment() {
    public synchronized void increment() {
        count++;
    }
}

class TestRunnable implements Runnable {
    Count c;
    //Count c = new Count();
    // not using this "new" here is called "dependancy injection"
    // this is called a design pattern 

    public TestRunnable (Count c) {
        this.c = c;
    }

    public void run() {
        for (int i = 0; i < 5000; i++) {
            c.increment();
        }
    }
}