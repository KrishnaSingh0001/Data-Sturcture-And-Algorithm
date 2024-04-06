package LoopsModule8;
import java.util.*;
public class GeometricProgression {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter n : ");
        int n = sc.nextInt();
        int a = 1;
        for(int i = 0 ; i <=n; i++){
            System.out.println(a);
            a*=2;
        }
    }
    
}
