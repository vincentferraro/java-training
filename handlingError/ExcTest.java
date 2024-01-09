package handlingError;

import java.lang.reflect.Array;

public class ExcTest {
    static void genException(){
        int nums[] = new int[4];

        System.out.println("Before exception is generated");

            nums[7]= 10;
            System.out.println("this won't be displayed");
    }
}


class ExcDemo2{
    public static void main(String[] args) {
        try{
            ExcTest.genException();
        }catch(ArrayIndexOutOfBoundsException exc){
            System.out.println("Index out-of-bounds!");
        }
        System.out.println("After catch statement");
    }
}
class excDemo3{
    public static void main(String[] args) {
        int number[] = { 4,8,16,32,64,128,256,212};
        int denom [] = { 2,0,4,4,0,8};

        for(int i = 0; i<number.length; i++){
            try{
                System.out.println(number[i] + " / " + denom[i]+ " is "+number[i]/denom[i]);
            }catch( ArithmeticException exc){
                System.out.println("Can't divide by Zero !");

            }catch( ArrayIndexOutOfBoundsException exc){
                System.out.println("No matching element found.");
            }
        }
    }
}

class excDemo4{
    public static void main(String[] args) {
        int number[] = { 4,8,16,32,64,128,256,212};
        int denom [] = { 2,0,4,4,0,8};

        for(int i = 0; i<number.length; i++){
            try{
                System.out.println(number[i] + " / " + denom[i]+ " is "+number[i]/denom[i]);
            }catch( ArrayIndexOutOfBoundsException exc){
                System.out.println("No matching element found.");
            }catch( Throwable exc){
                System.out.println("Some exception occured");
            }
        }
    }
}

class ThrowDemo{
    public static void main(String[] args) {
        try{
            System.out.println("Before exception");
            throw new ArithmeticException();
        }catch(ArithmeticException exc){
            System.out.println("Arimthmetic Exception occured");
        }
    }
}

class RethrowDemo{
    public static void main(String[] args) {
        try{
            try{
            System.out.println("Before exception");
            throw new ArithmeticException();
        }catch(ArithmeticException exc){
            System.out.println("Arimthmetic Exception occured");
            throw new Throwable();
        }
        }catch(Throwable exc){
            System.out.println("Exception occured");
        }
        
    }
}

