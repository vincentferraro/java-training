package Generics;

interface Containment<T>{
    boolean contains( T o);
}
public class MyClass<T> implements Containment<T> { // The class must be generic to implement Generic interface
    T [] arrayRef;

    MyClass(T[] o){
        arrayRef = o;
    }

    public boolean contains(T o){
        for(T x : arrayRef){
            if(x.equals(o)) return true;
        }
        return false;
    }
}

class GenIFDemo{
    public static void main (String args[]){
        Integer x[] = { 1,2,3};

        MyClass<Integer> ob = new MyClass<Integer> ( x);

        if(ob.contains(2)){
            System.out.println("2 is in ob");
        }else{
            System.out.println("2 is NOT in ob");
        }

        if(ob.contains(5)){
            System.out.println(" 5 is in ob");
        }
        else{
            System.out.println("5 is NOT in ob");
        }
    }
}

// Another example with Generic extends

interface Summation<T extends Number>{
    int sum(T[] o);
}

class MyClass2<T extends Number> implements Summation<T>{
    int total ;
     
    MyClass2(){
        total = 0;
    }
    int sum(T[] o){
        for( int i = 0 ; i < o.length; i++){
            total += o[i].intValue();
        }
        return total;
    }
}@