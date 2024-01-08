package interfacepack;

public class ByTwos implements Series {
    int start;
    int val;
    int prev;
    ByTwos(){
        start = 0;
        val = 0;
        prev = -2;
    }

    public int getNext(){
        prev = val;
        val += 2;
        return val;
    }

    public void reset(){
        val = start;
        prev = start -2;
    }

    public void setStart(int x){
        start = x;
        val = x;
        prev = x -2;
    }

    int getPrevious(){
        return prev;
    }
}

class ByThrees implements Series{
    int start;
    int val;
    int prev;
    ByThrees(){
        start = 0;
        val = 0;
        prev = -3;
    }

    public int getNext(){
        prev = val;
        val += 3;
        return val;
    }

    public void reset(){
        val = start;
        prev = start -3;
    }

    public void setStart(int x){
        start = x;
        val = x;
        prev = x -3;
    }

    int getPrevious(){
        return prev;
    }
}
class SeriesDemo{
    public static void main(String [] args){
        ByTwos ob = new ByTwos();
        ByThrees ob2 = new ByThrees();
        Series s;

        s = ob;
        for(int i = 0; i< 5 ; i++){
            System.out.println("Next value is " + s.getNext());
        }
        System.out.println("\nResetting");
        System.out.println("\nResetting");
        s.reset();

        for(int i = 0; i< 5 ; i++){
            System.out.println("Next value is "+ s.getNext());
        }
        System.out.println("\nStarting at 100");
        s.setStart(100);
        for(int i = 0; i< 5 ; i++){
            System.out.println("Next value is "+ s.getNext());
           
        }
        
    }
}