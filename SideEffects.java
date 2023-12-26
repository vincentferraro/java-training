public class SideEffects {
    public static void main(String []args){
        int i;

        i=0;

        // Studying short logical operator and logical operator
        if(true && (++i>100)){
            System.out.println("this won't be displayed");
            System.out.println("if statement executed: " +i);
            
        };
    }
}
