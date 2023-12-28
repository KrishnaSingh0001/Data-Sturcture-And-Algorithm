package Array;
import java.util.*;
public class ArrayCC {
    public static void main(String args[]){
        int marks[] = new int[100];
        Scanner sc = new Scanner(System.in);

        // int numbers [] = {1, 2, 3};
        marks[0] = sc.nextInt(); //Phy
        marks[1] = sc.nextInt();//Chem
        marks[2] = sc.nextInt();//Maths

        System.out.println("Phy : " + marks[0]);
        System.out.println("Chem : " + marks[1]);
        System.out.println("Maths : " + marks[2]);

        int percentage = (marks[0] + marks[1] + marks[2]) / 3 ;
        System.out.println("Percentage = " + percentage + "%");

    }
    
}
