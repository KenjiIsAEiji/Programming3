import java.util.Random;

class MyThrad extends Thread{
    //int theradId;
    public void run(){
        Random random = new Random();
        System.out.printf("%d",random.nextInt(9) + 2);
    }
}

public class Report3{
    public static void main(String[] args) {
        MyThrad t[] = new MyThrad[3];
        for(int i = 0; i < t.length; i++){
            t[i].start();
        }
    }
}
