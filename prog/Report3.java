import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

class MyThread implements Runnable {
    public void run(){
        Random random = new Random();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        try{
            String startTime = dateFormatter.format(LocalTime.now());

            long s = random.nextInt(10) + 1;
            Thread.sleep(1000 * s);

            String endTime = dateFormatter.format(LocalTime.now());
            System.out.printf("%3d start %s  wait %2d  end %s\n", Thread.currentThread().getId(), startTime, s, endTime);
        }catch(InterruptedException e){
            System.out.println(e);
        }
    }
}

public class Report3{
    public static void main(String[] args) {
        MyThread t = new MyThread();
        Thread[] threads = new Thread[30];
        for(int i = 0; i < threads.length; i++){
            threads[i] = new Thread(t);
            threads[i].start();
        }

        for(int i = 0; i < threads.length; i++){
            try{
                threads[i].join();
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
        System.out.println("Program end");
    }
}
