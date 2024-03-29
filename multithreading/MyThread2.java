package multithreading;

public class MyThread2 implements Runnable {
    Thread thrd;

    MyThread2(String name){
        thrd = new Thread(this, name);
        thrd.start();
    }

    public void run(){
        System.out.println(thrd.getName()+ " starting.");
        try{
            for(int count = 0; count < 10 ; count++){
                Thread.sleep(400);
                System.out.println("In " + thrd.getName() + " , count is " + count);
            }
        }
        catch(InterruptedException exc){
            System.out.println(thrd.getName() + " interrupted.");
        }
        System.out.println(thrd.getName()+ " terminating");
    }
}

class UseThreadsImprovement{
    public static void main(String args[]){
        System.out.println("Main thread starting");

        MyThread2 mt = new MyThread2("Child #1");
        MyThread2 mt2 = new MyThread2("Child #2");
        MyThread2 mt3 = new MyThread2("Child #3");

        for(int i = 0; i < 50 ; i++){
            System.out.print(".");
            try{
                Thread.sleep(100);
            }
            catch(InterruptedException exc){
                System.out.println("Main thread interrupted.");
            }
        }
        System.out.println("Main thread ending.");
    }
}