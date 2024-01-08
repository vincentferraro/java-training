package testpackage;
public class breakContinueStatement {
    
    public static void main (String [] args){
        int [] array = { 1,2,3,4,5,6,7,8,9,10};

        for(int element: array){
            if(element == 6){
                System.out.println("Found it: "+element);
                break;
            }else{
                System.out.println("Not found: "+element);
            }
        }

        search:
            for(int element: array){
                if(element== 3){
                    System.out.println("From Search, Found it: "+element);
                    continue search;
                }else{
                    System.out.println("Not found :"+element);
                }
            }

        
        
            
    }
}
