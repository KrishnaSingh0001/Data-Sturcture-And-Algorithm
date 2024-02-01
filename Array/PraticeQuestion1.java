// Question 1. Given an integer array nums , return true if any value appears 
//at least twice in the array ,and return false if every element is distinct.  
package Array;

public class PraticeQuestion1 {
    public static boolean Duplicate(int nums[]){
        for (int i= 0 ; i<nums.length-1 ; i++){
            for (int j = 0; j<nums.length;j++){
                if(nums[i] == nums[j]){
                    return true ;
                }
            }
        }
        return false ;
    }
    public static void main(String args []){
        int nums[] = {1,2,2,3,4,5};
        Duplicate(nums);
    }
}
