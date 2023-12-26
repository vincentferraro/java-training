package loop;

public class WhileGame {
    public static void main (String [] args) throws java.io.IOException{
        char letter = 'k';
        char answer, ignore;
        do{
            System.out.println("Enter a letter");
            answer = (char) System.in.read();

            do{
                ignore = (char) System.in.read();
            }while(ignore != '\n');
            
            if(letter == answer){
                System.out.println("Success");
            }else{
                System.out.println("TRY AGAIN");
            }
        }while(letter != answer);

        System.out.println("GoodBye!");
    }
}
