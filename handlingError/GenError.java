package handlingError;

public class GenError {
    public static int genError( int i) throws Throwable {
        if(i > 2){
            throw new Error("Error more than 2");
        }
        return i;
    }
}

class GenErrorDemo{
    public static void main(String[] args) {
        try{

            GenError.genError(2);
        }catch(Throwable exc){
            System.out.println("Error Catched"+exc);
        }
    }
}
