package classesObjectsMethods;

// Using static Methods
public class StaticMeth {
    static int val = 1024;

    static int valDiv2(){
        return val/2;
    }

}

class SDemo2{
    public static void main(String[] args) {
        System.out.println("val is " + StaticMeth.val);

        System.out.println("Static method valDiv2: "+ StaticMeth.valDiv2());
        System.out.println();

        System.out.println("val is " + StaticMeth.val);
    }
}
