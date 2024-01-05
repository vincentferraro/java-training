package Inheritage;

public class Object {
    int a; 
    int b;

    Object(int i, int j){
        a = i;
        b = j;
    }

    Object( Object ob){
        a = ob.a;
        b = ob.b;
    }
}

class Object2 extends Object{

    int c ;

    
    Object2(int i, int j, int k){
        super(i, j);
        c = k;
    }
    
    Object2(Object2 ob){
        super(ob);
        c = ob.c;
    }
}


class ObjectDemo{
    public static void main(String[] args) {
        Object2 o = new Object2(2,3,4);
        Object2 q = new Object2(o);
        System.out.println(q.a);
    }
}