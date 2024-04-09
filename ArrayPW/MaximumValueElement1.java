//Question : -- > find the maximum value out of all the element in the arrya.
// Method Number 1 
package ArrayPW;
public class MaximumValueElement1{
    public static void main(String args[]){
        // int max = arr[0];
        int[] arr = {10 , 8 , 12 , 4 , 6 , 23 , 8};
        int max = arr[0];

        for(int i = 0 ; i< 6;i ++ ){
            if (arr[i]> max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }

}