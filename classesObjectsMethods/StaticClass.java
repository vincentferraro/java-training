package classesObjectsMethods;

public class StaticClass {
    int x;
    static int y;

    int sum(){
        return x + y;
    }
}

class SDemo {
    public static void main(String[] args) {
        StaticClass ob1 = new StaticClass();
        StaticClass ob2 = new StaticClass();

        ob1.x = 10;
        ob2.x = 20;

        StaticClass.y = 100;
        System.out.println();
        System.out.println(ob1.sum());
        System.out.println(ob2.sum());

        System.out.println();

        StaticClass.y = 50;
        System.out.println(ob1.sum());
        System.out.println(ob2.sum());
        
    }
}