package Inheritage;

// Seeing order of construction 
public class A {
    A(){
        System.out.println("Contructor A");
    }
}

class B extends A {
    B(){
        System.out.println("Contructor B");
    }
}

class C extends B {
    C(){
        System.out.println("Contructor C");
    }
}

class Demo{
    public static void main(String[] args) {
        C c = new C();
    }
}
