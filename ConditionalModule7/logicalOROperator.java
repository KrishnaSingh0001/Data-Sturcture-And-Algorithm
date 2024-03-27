package ConditionalModule7;
import java.util.*;
public class logicalOROperator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        if (n%5==0 || n%3==0){
            System.out.println("Divisible by 5 and 3");
        }
        else{
            System.out.println("Not divisible by 3 and 5");
        }
    }
    
}
