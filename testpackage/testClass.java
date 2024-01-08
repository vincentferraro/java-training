package testpackage;

public class testClass {
    void hello(){
        System.out.println("Hellooo");
    }
}

class testClassDemo{
    public static void main (String [] args){
        testClass t = new testClass();
        t.hello();
    }
}
