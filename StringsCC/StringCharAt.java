package StringsCC;
import java.util.*;
public class StringCharAt {
    public static void printletters(String str){
        for(int i = 0; i<str.length(); i++){
            System.out.println(str.charAt(i) + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        String firstName = "Krishna";
        String lastName = "Singh";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
        System.out.println(fullName.length());

        System.out.println();

        printletters(fullName);

    }
    
}
