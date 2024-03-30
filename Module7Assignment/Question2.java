// Write a Java function that takes an integer as input and prints "Even" if the number is even and "Odd" if
// it's odd.

package Module7Assignment;
import java.util.*;
public class Question2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n: ");
        int n = sc.nextInt();
        System.out.println((n%2==0 ? "Even" : "Odd"));
    }
    
}
