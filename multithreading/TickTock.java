package multithreading;

// Show how to use wait and notify
public class TickTock {
    String state; // contains the state of the clock

    synchronized void tick( boolean running){
        if(!running){
            state = "ticked";
            notify(); // notify any waiting threads
            return;
        }

        System.out.print("Tick");

        state = "ticked";

        notify();

        try{

            while(!state.equals("tocked")){
                wait();
            }
        }catch(InterruptedException exc) {
            System.out.println("Thread interrupted");
        }
    }

    synchronized void tock(boolean running){
        if(!running){
            state = "tocked";
            notify();
            return;
        }

        System.out.println("Tock");

        state = "tocked";

        notify();
        try{
            while(!state.equals("ticked")){
                wait();
            }
        }catch(InterruptedException exc){
            System.out.println("Thread interrupted");
        }
    }

}


class MyThread5 implements Runnable {
    Thread thrd;
    TickTock ttOb;

    MyThread5(String name, TickTock tt){
        thrd = new Thread(this, name);
        ttOb = tt;
        thrd.start();
    }

    public void run(){
        if(thrd.getName().compareTo("Tick") == 0){
            for(int i = 0; i< 5; i++) ttOb.tick(true);
            ttOb.tick(false);
        }
        else{
            for(int i = 0; i< 5 ; i++) ttOb.tock(true);
            ttOb.tock(false);
        }
    }
}

class ThreadCom{
    public static void main(String args[]){
        TickTock tt = new TickTock();

        MyThread5 mt1 = new MyThread5("Tick", tt);
        MyThread5 mt2 = new MyThread5("Tock", tt);

        try{
            mt1.thrd.join();
            mt2.thrd.join();
        }catch(InterruptedException exc){
            System.out.println("Main Thread interrupted");
        }
    }
}