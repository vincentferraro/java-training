package loop;

public class Empty3 {
    public static void main (String [] args){
        int i = 0;
        int sum = 0;

        for(;i<5; sum += ++i);

        System.out.println("Sum result : "+ sum);
    }
}
