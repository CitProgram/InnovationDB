import java.util.Random;


class Runner implements Runnable{
    private Object o;
    Runner(Object o){
        this.o = o;
    }

@Override
public void run() {
        while (true)
        {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + o.toString());
        }

}
        }


public class Threads {
    public static String str = "123";

    public static void main(String[] args) throws InterruptedException {
        Object o = new Object();
        Thread thread = new Thread(new Runner(o));
        Thread thread2 = new Thread(new Runner(o));

        synchronized (o){
            thread.start();
            thread2.start();
        }
        Thread.sleep(1000);
        System.out.println(thread.getState());
        thread.stop();

    }
}


