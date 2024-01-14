
package BasicSortingAlgorithms;
import java.util.Arrays;

public class inbuiltsort {
        public static void inbuiltSort(int arr[]){
            for(int i =1;i<arr.length;i++){
                int curr = arr[i];
                int prev = i-1;
                //find out the current position of the array
                while(prev>=0 && arr[prev]>curr){
                    arr[prev+1] = arr[prev];
                    prev--;
                }
                //insertion
                arr[prev+1]= curr;
            }
        }
        public static void main(String args[]){
            int arr [] = {5,4,1,3,2}; 
            // inbuiltSort(arr);
            // Arrays.sort(arr);  // for all elements 
            Arrays.sort(arr , 0 , 3); // it is use for range 
            printArr(arr);
        }
        public static void printArr(int arr[]){
            for(int i = 0; i<arr.length;i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        } 
        
    }
    

