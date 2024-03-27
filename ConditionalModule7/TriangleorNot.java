package ConditionalModule7;

import java.util.*;
public class TriangleorNot {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number a : " );
        int a = sc.nextInt();
        System.out.println("Enter the number b : " );
        int b = sc.nextInt();
        System.out.println("Enter the number c : " );
        int c = sc.nextInt();

        if (((a + b)>c) && ((b+c)>a)  && ((a+c)>b)){
            System.out.println("Valid Triangle");
        }
        
        else{
            System.out.println("Invalid Triangle");
        }
            
        }

    }