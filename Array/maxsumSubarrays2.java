package Array;

public class maxsumSubarrays2 {
    public static void maxSubarraySum(int numbers[]){
        // int ts = 0;
        int currSum = 0; 
        int maxSum = Integer.MIN_VALUE; // - infinity
        int prefix[]= new int[numbers.length];
        prefix[0]=numbers[0];
        for(int i = 0; i<numbers.length; i++){
            int start = i;
            for(int j= i; j<numbers.length;j++){
                int end = j;
                // for(int k = start; k<=end; k++){
                //     currSum += numbers[k];
                // }
            currSum = start==0 ? prefix[end]: prefix[end] - prefix[start - 1] ;
            
            if(maxSum<currSum){
                maxSum = currSum;
                }
            }

        }
        System.out.println("max Sum = " + maxSum);
    }
    public static void main(String args[]){
        int numbers[] = {2 , 4 , 6 , 8 , 10};
        maxSubarraySum(numbers);
    }
    
}
