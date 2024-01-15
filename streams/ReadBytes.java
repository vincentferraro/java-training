package streams;

import java.io.IOException;

public class ReadBytes {
    public static void main(String[] args) throws IOException{
        byte data [] = new byte[10];
        System.out.println("Enter somes characters");
        System.in.read(data);
        System.out.println(" You entered:");
        for(int i = 0 ; i < data.length; i++){
            System.out.println((char) data[i]);
        }
    }
}
