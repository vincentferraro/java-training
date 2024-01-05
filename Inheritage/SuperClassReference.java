package Inheritage;

public class SuperClassReference {
    int i ;
    SuperClassReference(int i){
        this.i = i;
    }
}
class SuperClassReference2{
     int i ;
    SuperClassReference2(int i){
        
        this.i = i;
    }
}

class SuperClassReference3 extends SuperClassReference{
    int i ; 

    SuperClassReference3(int a, int b){
        super(a);
        i = b;
    }
}

class SuperClassReferenceDemo{
    public static void main(String[] args) {
        SuperClassReference s= new SuperClassReference(10);
        SuperClassReference t;
        SuperClassReference2 u = new SuperClassReference2(3);

        t = s;
        // t = u; // Not the same type
        SuperClassReference3 v = new SuperClassReference3(44, 5);

        t= v; // Works because SuperclassReference3 extends from SuperClassReference
    }
}
