package Generics;


class A{}
class B extends A{}
class C extends B{}

class D{}

class Gen<T>{
    T ob;

    Gen(T o){
        ob = o;
    }
}

public class BoundedWildcard {
    static void test ( Gen<? extends A> o){
        // ...
    }

    public static void main(String args[]){
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        Gen<A> w = new Gen<A>(a);
        Gen<B> w2 = new Gen<B>(b);
        Gen<C> w3 = new Gen<C>(c);
        Gen<D> w4 = new Gen<D>(d);
        test(w);
        test(w2);
        test(w3);
       test(w4); // ERROR because doesn't inherit from A's class
    }
}
