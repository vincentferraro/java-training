package testpackage;

// Array Training
public class arrayClass {

    
    public static void main (String... args){
       
        int [] myArray;
        myArray = new int [2];
        myArray[0]= 33;
        myArray[1] = 44;

       
        int [] myArray2 = {100, 200,300,400};
      
        // Multi Array
        String [][] multiArray = {
            {"Mrs","Hello"},
            {"Mr","World"}
        };
            
       
        System.out.println("Print:"+ myArray[0]+" "+myArray[1]);
        System.out.println("Print:"+ myArray2[0]+" "+myArray2[1]);
        System.out.println("Row 1: "+multiArray[0][0]+" "+multiArray[0][1]);
        System.out.println("Row 2: "+multiArray[1][0]+" "+multiArray[1][1]);

        int [] arrayCopied = new int[2];
        System.arraycopy(myArray2, 1, arrayCopied, 0, 2);
        System.out.println(arrayCopied[0]);
        

        int [] copyTo = java.util.Arrays.copyOfRange(myArray2, 2, 3);
        System.out.println(copyTo[0]);
    }
    
}
