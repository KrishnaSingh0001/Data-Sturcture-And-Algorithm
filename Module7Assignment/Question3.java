// Implement a Java function to determine if a given year is a leap year or not. Print "Leap Year" if true,
// otherwise print "Not a Leap Year."


package Module7Assignment;
import java.util.*;
public class Question3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year n: ");
        int n = sc.nextInt();
        if(n%4==0 ){
            System.out.println("Leap Year");
        } else{
            System.out.println("Not Leap Year");
        }

    }
}