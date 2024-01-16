package multithreading;

public class MyThread5 implements Runnable {
    Thread thrd;

    boolean suspended;
    boolean stopped;

    MyThread5(String name){
        thrd = new Thread(this, name);
        suspended = false;
        stopped = false;
        thrd.start();
    }

    public void run(){
        System.out.println(thrd.getName() + " starting.");
        try{
            for(int i = 1; i < 100; i++){
                System.out.print(i + " ");
                if((i%10)==0){
                    System.out.println();
                    Thread.sleep(250);
                }
            }

            synchronized(this){
                while(suspended){
                    wait();
                    if(stopped) break;
                }
                
            }
        }catch(InterruptedException exc){
            System.out.println(thrd.getName() + " interrupted");
        }
        System.out.println(thrd.getName() + " exiting.");
    }

    synchronized void mystop(){
        stopped = true;
        suspended = false;
        notify();
    }

    synchronized void mysuspend(){
        suspended = true;
    }
    synchronized void myresume(){
        suspended = false;
        notify();
    }
}

class Suspend{
    public static void main(String[] args) {
        
        MyThread5 ob1 = new MyThread5("My Thread");

        try{
            Thread.sleep(1000);

            ob1.mysuspend();
            System.out.println("Suspending thread");
            Thread.sleep(1000);

            ob1.myresume();
            System.out.println("Resuming thread");
            Thread.sleep(1000);

            ob1.mysuspend();
            System.out.println("Suspending thread");
            Thread.sleep(1000);

            ob1.myresume();
            System.out.println("Resuming thread");
            Thread.sleep(1000);

            ob1.mysuspend();
            System.out.println("Stopping thread");
            ob1.mystop();
        }catch(InterruptedException e){
            System.out.println("Main thread Interrupted");
        }

        try{
            ob1.thrd.join();
        }catch(InterruptedException e){
            System.out.println("Main thread Interrupted");
        }

        System.out.println("Main thread exiting");
    }
}