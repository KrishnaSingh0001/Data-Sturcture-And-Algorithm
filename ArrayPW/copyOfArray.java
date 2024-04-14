package ArrayPW;
import java.util.Arrays;
public class copyOfArray {
    public static void main(String args[]){
        int arr[] = {20 , 10 , 3 , 4 , 6 ,5 , 8};
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
        int [] nums = arr;  // (shallow copy )
        for(int i = 0 ; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
         // deep copy 
        int [] brr = Arrays.copyOf(arr , arr.length);
        brr [0] = 70;
        System.out.println(arr[0]);
    }
    
}
