package loop;

public class While {
    public static void main (String [] args){
        int i = 0;
        while(i <10){
            System.out.println("Value of i :" +i);
            i++;
        }
        System.out.println("End " + i);

        do{
            System.out.println("This loop will be executed at least one times");
        }while(i<10);
        System.out.println("End");
    }
}
