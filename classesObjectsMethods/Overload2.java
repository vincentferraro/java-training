package classesObjectsMethods;

// Overloading method with conversion

public class Overload2 {
    void f(int i){
        System.out.println("Inside f(int) : "+ i);
    }

    void f(double i){
        System.out.println("Inside f(double) : "+ i);
    }
}

class OvDemo{
    public static void main(String[] args) {
        int i =2;
        short s = 5;
        byte b = 11;
        float f = 2.33F;
        Overload2 o = new Overload2();
        o.f(i);
        o.f(s);
        o.f(b);

        o.f(f);
    }
}
