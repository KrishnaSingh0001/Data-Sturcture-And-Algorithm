
package StringsCC;
import java.util.*;

public class Strings {
    public static void main(String args[]){
        char arr[] = {'a', 'b','c','d'};
        String str = "abcd";
        String str2 = new String("xyz");
        //Strings are immutrable (Cannot change )
        Scanner sc = new Scanner(System.in); 
        String name;
        // name = sc.next();  // it takes only First word of a sentence 
        name = sc.nextLine(); // it takes all words in a Sentence 
        System.out.println(name);
    }
    
}
