package ArrayPW;
import java.util.Arrays;
public class builtInMethod {
    public static void main(String args[]){
        int arr[] = {10 , 600,30,40,50};
        for(int i = 0 ; i< arr.length; i++){
            System.out.println(arr[i] + " ");
        }
        Arrays.sort(arr);
        System.out.println();
        for(int i = 0 ; i<arr.length; i++){
            System.out.println(arr[i] + " ");
        }
    }
    
}
