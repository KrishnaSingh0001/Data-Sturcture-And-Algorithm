// find first and Second largest  element of an array 

package ArrayPW;

public class SecondLargestArray {
    public static void main(String args[]){
        // int[] arr = {10 , 20 , 30 , 40 , 50 , 60};
        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        int n = arr.length;
        int mx = Integer.MIN_VALUE;
        for(int i = 0 ; i<n; i++){
            mx = Math.max(mx, arr[i]);
            // if(arr[i]>mx){
            //     arr[i]=mx;
            // }
        }

        int smx = Integer.MIN_VALUE;
        for(int i = 0 ; i<n; i++){
            if(arr[i]!= mx){
                smx = Math.max(smx, arr[i]);
            }
        }
        System.out.println(mx);
        System.out.println(smx);
    }
    
}
