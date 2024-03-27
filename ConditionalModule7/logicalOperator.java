package ConditionalModule7;
import java.util.*;
public class logicalOperator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        if(99<n && n<1000){
            System.out.println("3-digit number ");
        }
        else{
            System.out.println("Not 3-digit number");
        }

    }
    
}
