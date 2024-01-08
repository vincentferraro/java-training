package testpackage;
public class expressionClass {
    
    public static void main(String [] args){
        // Expression

        int value1 = 10;
        
        if(value1 >0){
            System.out.println("More than 0:"+ value1);

        }

        // important to perform clearly parenthesis 

        System.out.println((10+4)/2);


        // STATEMENT
        // variable statement
        int addValue = 3;

        // method invocation statement
        System.out.println(addValue);

        // object Creation statement
        Bike myBike = new Bike();
        
    }
}
class Bike{}
