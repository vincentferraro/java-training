package classesObjectsMethods;

public class MyClass {
    private int alpha;
    public int beta;
    private int gamma;

    void setAlpha(int a){
        alpha = a;
    }
    int getAlpha(){
        return alpha;
    }
}

class AccessDemo{
    public static void main(String[] args) {
        MyClass obj = new MyClass();

        obj.setAlpha(2);
        System.out.println(obj.getAlpha());

        obj.beta =2;
        System.out.println("BETA"+obj.beta);
    }
}