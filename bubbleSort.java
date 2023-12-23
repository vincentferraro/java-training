import java.util.Arrays;

public class bubbleSort {
    
    public static void main(String [] args){

        int arr[]={9,2,3,5,4,8,12};
        int count = 0;
        for(int i = 0; i<(arr.length-1); i++){
            if(arr[i]>arr[i+1]){

                int temp;
                temp= arr[i];
                arr[i]= arr[i+1];
                arr[i+1]=temp;
                i=-1;
            }
            count++;
        }

        System.out.println("COUNT:"+count+", END:"+Arrays.toString(arr));
    }
}
