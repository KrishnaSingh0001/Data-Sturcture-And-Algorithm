//Question For a given Set of String , Print the largest String 
//"Apple " , "Mango", " Banana"

package StringsCC;

import java.util.*;
public class PrintLargestString {
    public static void main(String args) {
        String fruits[] = { "apple ", "Mango ", "Banana" };
        Scanner sc = new Scanner(System.in);
        String largest = fruits[0];
        for (int i = 0; i < fruits.length; i++) {
            if (largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];

            }
        }
        System.out.println(largest);

    }

}

