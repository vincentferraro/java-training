package loop;
public class loopControl {
    
    public static void main(String []args){
        int i, j;
        int loop = 0;
        for(i=0,j = 10; i<j; i++, j--){
            loop++;
            System.out.println("Loop : "+ loop);
            
        }
    }
}
