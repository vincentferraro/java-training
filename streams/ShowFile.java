package streams;
import java.io.*;


public class ShowFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin = null;

        if(args.length != 1){
            System.out.println("Usage: ShowFile File");
            return;
        }

        try{
            fin = new FileInputStream(args[0]);
            do{
                i = fin.read();
                if( i != -1) System.out.print((char) i);
            }while(i != -1);
            System.out.println();
        }catch(FileNotFoundException exc){
            System.out.println(" File Not Found");
        }catch(IOException exc){
            System.out.println("Error reading file");
        }finally{
            try{
                if(fin != null){
                    fin.close();
                }
                System.out.println("File closed");
            }catch(IOException exc){
                System.out.println("Error closing file");
            }
        }
        
        
    }
}
