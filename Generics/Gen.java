package Generics;

public class Gen<T> {
    T ob;

    Gen(T o){
        ob = o;
    }

    T getob(){
        return ob;
    }

    void showType(){
        System.out.println("Type of T is " +ob.getClass().getName());
    }
}

class GenDemo{
    public static void main(String[] args) {
        Gen<Integer> iOb;

        iOb = new Gen<Integer>(88);

        iOb.showType();

        int v = iOb.getob();
        System.out.println("Value of iOb "+ v);

        Gen<String> iOb2 = new Gen<String>("Generics Tests");
        System.out.println("Value of iOb "+ iOb2.getob());

    }
}