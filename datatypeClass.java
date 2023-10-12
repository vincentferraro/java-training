public class datatypeClass {
    
    public class User {
        String name = "Bob";

        public void setName(String name){
            this.name = name;
        }

        public String getName(){
            return this.name;
        }
    }
   
    

    // Print

    public static void main(String [] args){  // Default to launch problem
        int myInteger= 1000;
        float aFloat= 124.4f;
        double myDouble = 33.4;
        // char aChat = 'A';
        // String myString = "Hello World";
        // boolean myBoolean = true; // or false

        // // specials

        // long myLong = 123_444_200;
        // byte myBytes = 0b101101;

        System.out.println(myInteger);
        System.out.println(aFloat);
        System.out.println(myDouble);

        var hello = "Hello World";
        System.out.println(hello);
    }


}
