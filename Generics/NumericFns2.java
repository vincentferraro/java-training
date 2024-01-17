package Generics;

public class NumericFns2 <T extends Number>{ // extends Number to inherit class type and methods
    T num;

    NumericFns2(T n){
        num = n;

    }

    double reciprocal(){
        return 1 / num.doubleValue(); // Possible because T extends Numbers, 
    }

    double fraction(){
        return num.doubleValue() - num.intValue();
    }

    boolean absEqual(NumericFns2<?> ob){
        if(Math.abs(num.doubleValue()) == Math.abs(ob.num.doubleValue())){
            return true;
        }
        return false;
    }


}


class WildcardDemo{
    public static void main(String[] args) {
        
        NumericFns2<Integer> iOb = new NumericFns2<Integer>(6);
        NumericFns2<Double> dOb = new NumericFns2<Double>(-6.0);
        NumericFns2<Long> lOb = new NumericFns2<Long>(5L);

        System.out.println("Testing iOb and dOb");
        if(iOb.absEqual(dOb)){
            System.out.println("absolute values are equals");
        }else{
            System.out.println("Absolute values differ");
        }
        System.out.println();

        System.out.println("Testin iOb and lOb");
        if(iOb.absEqual(lOb)){
            System.out.println("absolute values are equals");
        }else{
            System.out.println("Absolute values differ");
        }

    }
}
