package ConditionalModule7;
import java.util.*;
public class profitloss {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Cost Price: ");
        int cp = sc.nextInt();
        System.out.println("Enter selling price: ");
        int sp = sc.nextInt();

        if(sp>cp){
            System.out.println("Profit is: " + (sp-cp));
        } else if (sp == cp){
            System.out.println("No Profit , No loss");
        } else{
            System.out.println("Loss is: "+ (cp-sp));
        }
    }
}
