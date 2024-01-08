package Inheritage;

public class Area {
    void area(){
        System.out.println("AREA from AREA");
    }
}

class Rectangle extends Area{
    void area(){
        System.out.println("AREA from Rectangle");
    }
}
class Triangle extends Area{
    void area(){
        System.out.println("AREA from Triangle");
    }
}

class AreaDemo{
    public static void main(String[] args) {
        Area [] arr  = new Area[2];

        arr[0] = new Area();
        arr[1] = new Triangle();
       

        for(int i = 0; i<arr.length; i++){
            arr[i].area();
        }
    }
}