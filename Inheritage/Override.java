package Inheritage;

public class Override {
     void show(){
        System.out.println("Hello ...");
     }
}

class Override2 extends Override{
    void show(){ // method Override
        super.show();   // call the superclass method and add the override instructions
        System.out.println("... World");
    }
}

class OverrideDemo{
    public static void main(String[] args) {
        Override2 o = new Override2();

        o.show();
    }
}