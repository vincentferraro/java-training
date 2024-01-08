package interfacepack;

public interface IConst {
    int MIN = 0;
    int MAX = 10;
    String ERRORMESSAGE = "Boundary Error";
}

class IConstD implements IConst {
    public static void main(String [] args){
        int nums[] = new int[MAX];
        for(int i = MIN; i < 11 ; i ++){
            if(i >= MAX ) System.out.println(ERRORMESSAGE);
            else{
                nums[i] = i;
                System.out.println(nums[i] + " ");
            }
        }
    }
}
