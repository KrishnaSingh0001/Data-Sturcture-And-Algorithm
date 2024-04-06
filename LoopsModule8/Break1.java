package LoopsModule8;
import java.util.*;
public class Break1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();


        int x = 0 ;  // means prime 
        for(int i = 2; i<= n-1; i++){
            if(n%i ==0){
                System.out.println("Composite number");
                x = 1;
                break;
            }
        }
        if(x== 0){
            System.out.println("Prime number");
        } else if (n==1) {
            System.out.println("Niether prime nor composite");
        }
    }
    
}
