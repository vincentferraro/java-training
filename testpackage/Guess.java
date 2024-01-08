package testpackage;
public class Guess {
    public static void main (String [] args) throws java.io.IOException{
        char letter = 'k';

        System.out.println("Enter a letter :");
        char answer = (char)System.in.read();
        System.out.println(answer);
        if(letter == answer){
            System.out.println("Success");
        }else{
            System.out.println("Try again");

        }

    }
    
}
