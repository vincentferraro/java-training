public class HelloWorld {
    
    private int number;

    public HelloWorld(int number){
        this.number = number;
    }

    public int getNumber(){
        return this.number;
    }
    public void setNumber(int num){
        this.number = num;

    }
    public static void main (String [] args){
        HelloWorld h1 = new HelloWorld(2);
        System.out.println(h1.getNumber());
    }
}


