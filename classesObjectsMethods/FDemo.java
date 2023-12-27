package classesObjectsMethods;

public class FDemo {
    int x;

    // Constructor
    FDemo(int i ){
        x = i;
    }

    // Methods

    // called when object is recycled
    protected void finalize(){
        System.out.println("Finalizing" + x);
    }

    // generate an object that is immediately destroyed
    void generator(int i){
        FDemo o = new FDemo(i);
    }
}
