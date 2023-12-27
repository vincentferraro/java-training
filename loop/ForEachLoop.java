package loop;

public class ForEachLoop {
    
    public static void main (String[] args){
        int arr[]= {1,2,3,4};
        int sum=0;

        for(int element : arr){
            sum += element;
             System.out.println(element);
        }

        System.out.println(sum);
    }
}
