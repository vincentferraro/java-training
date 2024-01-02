package classesObjectsMethods;


public class Varargs { // Three dots operator

   
        static void vaTest(int ... v){
            System.out.println("Number of args :" + v.length);
            System.out.println("Number of args :" + v.length);

            for(int i = 0; i< v.length; i++){
                System.out.println(" arg " + i+ " : " + v[i]);
            }
            System.out.println();
        }

        // overloading

        static void vaTest(double ... v){
            System.out.println("Number of args :" + v.length);
            System.out.println("Number of args :" + v.length);

            for(int i = 0; i< v.length; i++){
                System.out.println(" arg " + i+ " : " + v[i]);
            }
            System.out.println();
        }

        static void vaTest(int a, int ... v){
            System.out.println("Number of args :" + v.length);
            System.out.println("Number of args :" + v.length);

            for(int i = 0; i< v.length; i++){
                System.out.println(" arg " + i+ " : " + v[i]);
            }
            System.out.println();
        }
    
}

class VarargsDemo{
    public static void main(String[] args) {
        Varargs v = new Varargs();

        int n []= {1,2,3,4,5};

        v.vaTest(n);

        double c [] = {1.2,1.3,1.4};

        v.vaTest(c);
    }
}
