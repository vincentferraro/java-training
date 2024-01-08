package handlingError;

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