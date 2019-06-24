import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

class MyThread implements Runnable{
    public void run(){
        //interaction wait Second
        Random random = new Random();
        long wait = random.nextInt(9) + 2;
        
        //Get Thread ID
        long id = Thread.currentThread().getId();

        //Get Start Time
        DateTimeFormatter dF = DateTimeFormatter.ofPattern("HH:mm:ss");
        String startTime = dF.format(LocalTime.now());

        //sleep
        try{
            Thread.sleep(1000 * wait);
        }catch(InterruptedException e){
            System.out.println(e);
        }

        //Get End Time
        String endTime = dF.format(LocalTime.now());

        //print
        System.out.printf("%d start %s wait %2d end %s\n", id, startTime, wait, endTime);
    }
}

public class Report3{
    public static void main(String[] args) {
        //thread creation
        MyThread t = new MyThread();
        Thread[] threads = new Thread[30];
        for(int i = 0; i < threads.length; i++){
            threads[i] = new Thread(t);
        }

        //thread start
        for(int i = 0; i < threads.length; i++){
            threads[i].start();
        }

        //thread observation
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
