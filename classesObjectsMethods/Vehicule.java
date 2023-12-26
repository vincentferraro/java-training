package classesObjectsMethods;

public class Vehicule {
    int passengers;
    int fuelcap;
    int mpg;
}

class VehiculeDemo{
    public static void main (String [] args){
        Vehicule minivan = new Vehicule();
        minivan.passengers = 1;
        minivan.fuelcap = 100;
        minivan.mpg= 10;
        Vehicule minivan2 = minivan;
        System.out.println("Minivan : ");
        System.out.println("\t Passengers : " + minivan.passengers);
        System.out.println("\t Fuelcap : " + minivan.fuelcap);
        System.out.println("\t MPG : " + minivan.mpg);

        minivan2.passengers =2;
        System.out.println("Minivan: " + minivan.passengers);

    }
}