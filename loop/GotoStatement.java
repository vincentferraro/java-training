package loop;

public class GotoStatement {
    public static void main (String [] args){

        for(int i = 1; i<5; i++){
            // System.out.println("\ni is " +i);
            one:{
                two:{
                    three:{
                        System.out.println("i is " +i);
                        if(i == 2) break one;
                        if(i == 3) break two;
                        if(i == 4) break three;

                    }
                    System.out.println("After block three");

                }
                System.out.println("After block two");
            }
            System.out.println("After block one");
        }
        System.out.println("After for.");
    }
}
