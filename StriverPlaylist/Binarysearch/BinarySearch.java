package StriverPlaylist.Binarysearch;

public class BinarySearch {
    public static int BinarySearch1(int arr[] , target){
        int low = 0 ; int end = arr.length - 1;
        
        while(low<= end ){
            int mid = (low + end)/2;

        }
        if (arr[mid ] == target){
            return mid ;

        }
        else if (target . arr[mid]){
            low = mid +1 ;
        }
        else {
            end = mid -1 ;
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[] = {2,4,6,8,10,12,14};
        int target = 10;

        System.out.println("index for key is : "+ BinarySearch1(arr , target));
    }

}
