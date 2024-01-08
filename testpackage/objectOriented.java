package testpackage;
public class objectOriented {
    
    public static void main (String [] args){

        Car v1 = new Car();
        System.out.println(v1.getEngine());
        System.out.println(v1.getPlaces());
        v1.addPassenger();
        v1.addPassenger();
        System.out.println(v1.getPlaces());
        v1.addPassenger();
        System.out.println(v1.getPlaces());
        v1.removePassenger();
        System.out.println(v1.getPlaces());
    }


}

class Car {
    private boolean engine =true;
    protected int places = 3;
    private boolean driver = false;

    // Getter

    public boolean getEngine(){
        return this.engine;
    }
    public int getPlaces(){
        return this.places;
    }
    public void addPassenger(){
        if(this.places>0){
            this.places -=1;
        }else{
            System.out.println("No available place in the car");
        }
    }

    public void removePassenger(){
        if(this.places<=3){
            this.places +=1;
        }else{
            System.out.println("All seat are free");
        }
    }
    public boolean haveEngine(){
        if(this.engine == true){
            return true;
        }else{
            return false;
        }
    }
    public boolean putDriver(){
        if(this.driver== false){
            this.driver= true;
            return this.driver;
        }else{
            System.out.println("Driver already in the Car");
            return this.driver;
        }
    }
    public boolean removeDriver(){
        if(this.driver== true){
            this.driver= false;
            return this.driver;
        }else{
            System.out.println("Driver remove from Car");
            return this.driver;
        }
    }
}

class Ferrari extends Car{
    private boolean turbo = true;
    private String brand = "Ferrari";
    private String model;
    public Ferrari(String model){
        super(); // Call 
        this.places = 1;
        this.model= model;
    }

    @Override
    public void removePassenger(){
        if(this.places==0){
            this.places +=1;
        }else{
            System.out.println("No passenger in the car");
        }
    };

    public boolean getTurbo(){
        return this.turbo;

    }
    public String getBrand(){
        return this.brand;
    }

    public String getModel(){
        return this.model;
    }

}