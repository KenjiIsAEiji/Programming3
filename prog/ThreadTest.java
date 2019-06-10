class MyTherad extends Thread{
    public void run(){
        ThreadTest.num++;
    }
}

public class ThreadTest{
    public static int num = 10;
    public static void main(String[] args) {
        System.out.println(num);
        MyTherad t = new MyTherad();

        t.start();

        try{
            t.join();
        }catch(InterruptedException exception){
            System.out.println(exception);
        }

        System.out.println(num);
    }
}