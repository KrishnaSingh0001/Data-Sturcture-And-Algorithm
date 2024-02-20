// Question 1. Count how many times lower case vowels 
//              occureds in a String entered by the users .
package StringQuestion;
import java.util.*;
public class StringQuestion1 {
    public static void main(String args[]){
        String str = new Scanner(System.in).next();
        int count = 0;

        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch =='o' || ch=='u'){
                count++;
            }

        }
        System.out.println("Lower case occures in the string is : " + count);
    }
    
}
