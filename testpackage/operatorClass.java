package testpackage;
public class operatorClass {
    
    static int value1 = 1;
    static int value2 = 2;
    static int value3 = 3;

    public static void main(String [] args){
        // Addition
        System.out.println(value1+value2);

        // Substraction
        System.out.println(value2 - value1);

        // Multiply
        System.out.println(value1*value2);

        // Division
        System.out.println(value3/value2);

        // increment value  ++
        System.out.println(++value1);

        // decrement value --
         System.out.println(--value1);
        // Modulo
        System.out.println(value3%3);

        // Assignment operator to compound assignement
        System.out.println(value3 +=5);

        // EQUALITY OPERATO

        System.out.println("//////////////////////");

        System.out.println(value1 != value2);
        System.out.println(value1 == value2);
        System.out.println(value1 < value2);
        System.out.println(value1 > value2);
        int value4 = 2;
        System.out.println(value2 <= value4);

        // CONDITIONNAL
        System.out.println("////CONDITIONNAL////");

        System.out.println((value1==1)&& value2==2);
        System.out.println(value1==1 || value2 !=2);
        
        System.out.println("////IF ELSE OR ?////");
        if(value1 == 1){
            boolean bol = true;
            System.out.println(bol);
        }

        boolean bol2 = value1==1? true:false;
        System.out.println(bol2);


        // INSTANCE OF
        System.out.println("////INSTANCE OF////");
        Parent parent1 = new Parent();
        Parent child1 = new Child();
        if(parent1 instanceof Parent){
            System.out.println("TRUE, Instance of Parent");
            System.out.println(parent1.getClass());
        }
        if(child1 instanceof Parent){
            System.out.println("TRUE,Instance of Parent");
            System.out.println(child1.getClass());
        }
        
    }
    

}

class Parent{}
class Child extends Parent implements myInterface{}
interface myInterface{}
