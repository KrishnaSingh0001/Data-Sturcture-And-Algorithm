//Question : -- > find the maximum value out of all the element in the arrya.
// Method Number 2 

package ArrayPW;

public class MaximumValueElement2 {
    public static void main(String args []){
        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i<n-1; i++){
            if(arr[i]>max){
                arr[i]=max;
            }
        }
        System.out.println(max);
    }
    
}
