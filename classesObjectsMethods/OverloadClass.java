package classesObjectsMethods;

public class OverloadClass {
    int x;

    OverloadClass(){
        System.out.println("Inside MyClass().");
        x=0;
    }

    OverloadClass(int i){
        System.out.println("Inside MyClass(int).");
        x=i;
    }
    OverloadClass(double d){
        System.out.println("Inside MyClass(double).");
        x=(int) d;
    }
    OverloadClass(int i, int j){
        System.out.println("Inside MyClass(int, int).");
        x=i*j;
    }
}

class OverDemo{
    public static void main(String[] args) {
        OverloadClass o = new OverloadClass();
         OverloadClass v = new OverloadClass(2);
          OverloadClass e = new OverloadClass(2.5);
           OverloadClass r = new OverloadClass(3,3);
        
           System.out.println(o.x);
        System.out.println(v.x);
        System.out.println(e.x);
        System.out.println(r.x);
   
        }
}
