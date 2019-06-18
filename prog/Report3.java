import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

class MyThread implements Runnable {
    public void run(){
        Random random = new Random();
        long id = Thread.currentThread().getId();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String startTime = dateFormatter.format(LocalTime.now());

        try{
            long s = random.nextInt(9) + 2;
            Thread.sleep(1000 * s);

            String endTime = dateFormatter.format(LocalTime.now());
            System.out.printf("%2d start %s  wait %2d  end %s\n", id, startTime, s, endTime);
        }catch(InterruptedException e){
            System.out.println(e);
        }
    }
}

public class Report3{
    public static void main(String[] args) {
        MyThread t = new MyThread();
        Thread[] threads = new Thread[30];

        for(int i = 0; i < threads.length; i++) threads[i] = new Thread(t);

        for(int i = 0; i < threads.length; i++) threads[i].start();

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
