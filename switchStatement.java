class switchStatement{


    public static void main (String [] args){

        int value = 0;
        System.out.println(getWord(value));
        String res;
        switch(value){
            case 1:
                res = "Hello";
                break;
            case 2:
                res = "World";
                break;
            default:
                res = "Unknown";
        }
        System.out.println(res);
}

public static String getWord(int v){
            return switch(v){
                case 0 -> "Hello";
                case 1 -> "World";
                case 2 -> "Good";
                case 3 -> "Bye";
                default-> "HAHAHA";
            };
        };
    }

