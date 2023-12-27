package classesObjectsMethods;

public class Vehicule {
    int passengers;
    int fuelcap;
    int mpg;

    Vehicule(int p, int f, int m){
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    int range(){
        return mpg *fuelcap;
    }

    double fuelneeded(int miles){
        return (double) miles /mpg;
    }
}

class VehiculeDemo{
    public static void main (String [] args){
        Vehicule minivan = new Vehicule(1,100,10);
        
        int res = minivan.range();
        System.out.println(res);
        double fuelneeded = minivan.fuelneeded(300);
        System.out.println(fuelneeded);

    }
}