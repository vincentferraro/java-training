package DataTypes;

public class Enumer {
   
   
}

enum Transport{
    CAR(65),TRUCK(55), AIRPLANE(600);
    private int speed;

    Transport(int s){ 
        speed = s;
    };

    int getSpeed(){
        return speed;
    }
}

class EnumDemo3{
    public static void main(String[] args) {
        Transport tp;

        System.out.println("Typical speed for an airplane is " + Transport.AIRPLANE.getSpeed()+" miles per hour");

        System.out.println("All Transport speeds");
        for(Transport t : Transport.values()){
            System.out.println(t + " typical speed is " + t.getSpeed() + " miles per hours.");
        }
    }
}