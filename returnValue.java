public class returnValue {
    static public String getHello(){
        return "Hello";
    }
    
    static int variable = 2;
    static public void add( int value){
        variable += value;
        return;
    }

    enum Day{
        MONDAY,TUESDAY,WEDNESDAY,THURDAY,FRIDAY,SATURDAY,SUNDAY
    };
    static public String calculDate(Day d){
        return switch(d){

            case MONDAY,TUESDAY,WEDNESDAY,THURDAY,FRIDAY -> "week";
            default ->{
                String remainingWorkDay = "week-end";
                yield remainingWorkDay;
            }
        };

    }
    public static void main (String []args){

        System.out.println(getHello());
        
        System.out.println(variable);
        System.out.println("/// Using method add()");
        add( 3);
        System.out.println("/// After method :"+variable);
        Day dayday = Day.FRIDAY;
        System.out.println(calculDate(dayday));
    }
}
