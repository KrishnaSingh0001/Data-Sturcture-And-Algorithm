package ConditionalModule7;
import java.util.*;
public class marks {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n : " );
        int n = sc.nextInt();

        if(n>= 81){
            System.out.println("Very Good");
        }
        else if(n>= 61  && n<=88){
            System.out.println("Good");
        }
        else if (n>=41 && n<= 68){
            System.out.println("Average");
        }
        else{
            System.out.println("Fail");
        }
        
}
}
