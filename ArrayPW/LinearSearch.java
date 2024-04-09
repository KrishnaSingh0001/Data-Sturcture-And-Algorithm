package ArrayPW;
import java.util.*;
public class LinearSearch {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr target element : ");
        int x = sc.nextInt();
        System.out.print("Enter Array Size : ");
        int n = sc.nextInt();
        int [] arr = new int [n];
        System.out.print("Enetr Array Element: ");
        for (int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        // solution
        boolean flag = false ; // false means not found 
        // for(int i = 0 ; i<n; i++){
        //     if(arr[i] == x){
        //         System.out.println("Element found ");
        //     }
        //     else{
        //         System.out.println("Element Not found ");
        //     }
        // }
        for(int i = 0 ; i<n; i++){
            if(arr[i] == x){
                flag = true;
                break;
            }
        }

    }
    
}
