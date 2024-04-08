package ArrayPW;
import java.util.*;
public class outputArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // int x = sc.nextInt();
        int [] arr= new int[7];
        for(int i = 0; i<=6; i++){
            arr[i] = sc.nextInt();
        }
        
        // int [] arr= new int[7];
        // arr[0]= 10;
        // arr[1]= 20;
        // arr[2]= 30;
        // arr[3]= 40;
        // arr[4]= 50;
        // arr[5]= 60;
        // arr[6]= 70;

        for(int i = 0; i<=6; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
}
