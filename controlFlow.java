class controlFlow{
    // If-then  else statement

    public static void main(String []args){
        int speed = 100;
        // boolean isMoving = true;
        // System.out.println("Speed before if statement:"+speed);
        //     if(isMoving == true){ // If statement
        //         // then statement
        //         --speed;
        //     }
        // System.out.println("Speed after if statement"+speed);
        // isMoving= false;
        // System.out.println("Speed before if-else statement:"+speed);
        // if(isMoving == true){ // If statement
        //     --speed;
        // }else{// else statement
        //     System.out.print("Not moving, in Else statement");
        // }

        // if(speed <50){
        //     speed +=25;
        //     System.out.println("Less than 50, now:"+speed);
        // }else if(speed >50){
        //     speed -= 30;
        //     System.out.println("More than 50, now:"+speed);
        // }else if(speed >= 0){
        //     System.out.println("Engine stopped");
        // }

        // while(speed >90){
        //     --speed;
        //     System.out.println(speed);
        // }
        // do{
        //     ++speed;
        //     System.out.println(speed);
        // }while(speed<100);

        for(int i = 0; i<10;i++){
            System.out.println("Hello n°"+i);
        }

        int [] array={1,2,3,4,5,6};
        for(int item:array){
            System.out.println("Number:"+item);
        }
    }
}
