package Inheritage;

// INHERITANCE CLASS AND PRIVATE MEMBER'S CLASS.
public class TwoDShape {
    private double width;
    private double height;

    // Contructor by default
    TwoDShape(){
        width = height = 0;
    }
    // Constructor with same width and height
    TwoDShape(double x){
        width = height = x ;
    }
    //Constructor with double parameters
    TwoDShape(double w, double h){
        width = w;
        height = h;
    }

    void showDim(){
        System.out.println("Width and height are " + width + " and " + height);
    }

    // ACCESSOR METHODS

    double getWidth(){
        return width;
    }
    double getHeight(){
        return height;
    }
    void setWidth(double w){
        width = w;
    }
    void setHeight(double h){
        height = h;
    }
}

class Triangle extends TwoDShape{
    private String style;
    // Add super() for each different constructor

    Triangle(){
        super(); // call superclass constructor by default
        style ="none";
    }

    Triangle(double x, String s){
        super(x); // call superclass constructor with one parameter
        style = s;
    }

    Triangle(double w, double h, String s){
        super(w,h);  // call constructor from superclass with two parameter
        // setWidth(w);    // Initialize TwoDShape portion of object
        // setHeight(h);     // Initialize TwoDShape portion of object
        style = s;
    }
    double area(){
        return getWidth() * getHeight() / 2;
    }

    void showStyle(){
        System.out.println("Triangle is " + style);
    }
}


class Rectangle extends TwoDShape{

    Rectangle(double w, double h){
        super(w,h);
    }

    boolean isSquare(){
        if(getWidth() == getHeight()) return true;
        return false;
    }

    double area(){
        return getHeight() * getWidth() ;
    }
}

class Shapes{
    public static void main(String[] args) {
        
        Triangle t1 = new Triangle(4.0,4.0, "filled");
        Triangle t2 = new Triangle(8.0,12.0,"outlined");

       

        System.out.println(" Info for t1 :");
        t1.showStyle();
        t1.showDim();

        System.out.println(" Area is " + t1.area());

        System.out.println();

        System.out.println("Info for t2:");
        t2.showStyle();
        t2.showDim();
        System.out.println("Area is "+ t2.area());

        System.out.println("//////////");

        Rectangle r1 = new Rectangle(1.0,1.0);
        System.out.println("Is square? " + r1.isSquare());
    }
}
