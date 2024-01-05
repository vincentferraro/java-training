package classesObjectsMethods;

public class Test {

    public  static int count;
    int meth(int a, int b){
        return a +b;
    }
    String meth(int a, int b, int c){
        return Integer.toString(a+b);
    }

    int acum(int ... val){
        int count = 0;
        for(int v : val){
            count +=v;
        }
        return count;
    }
}


class TestDemo{
    public static void main(String[] args) {
        Test t = new Test();

        System.out.println(t.meth(1, 2));
        System.out.println(t.meth(3, 4,5));

        t.count=2;
        System.out.println(t.count);

        Test t2 = new Test();

        t2.count= 5;
        System.out.println(t.count);

        int tab [] = {1,2,3,4};
        int res = t.acum(tab);
        System.out.println(res);
    }
}

class Stack {
    private int [] values;
    private int size;

    Stack( int s){
        size = s;
        
    }

    public int length(){
        return size;
    }

    public void push(int i){
        if(values.length != size){
            
        }
    }
    
}