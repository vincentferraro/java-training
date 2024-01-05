package Inheritage;

public class Super {
    
    int i;
}

class SubClass extends Super{
    int i;
    SubClass(int i, int j){
        super.i = i;
        i = j;
    }
    void show(){
        System.out.println("i from superclass : " + super.i);
        System.out.println("i from subClass : " + i);
    }
}

class SuperDemo{
    public static void main(String[] args) {
        SubClass s = new SubClass(1, 2);
        s.show();
    }
}