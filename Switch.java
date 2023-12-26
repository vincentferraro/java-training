public class Switch {
    public static void main (String []args) throws java.io.IOException{

        System.out.println("Enter a Integer between 1 and 10");

        int answer = (int) System.in.read() - '0'; // Substract by 0 because of ASCII notation
        
        switch(answer){
            case 3: 
                System.out.println("Little number");
                break;
            case 5,6,7:
                System.out.println("Medium number");
                break;
            case 8, 9, 10:
                System.out.println("Big number!!!");
                break;
            default:
                System.out.println("Number not between 1 and 10");
        }


    }
}
