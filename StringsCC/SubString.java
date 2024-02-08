package StringsCC;

public class SubString {
    public static String subString(String str , int si, int ei){
        String subStr = " ";
        for(int i = si; i<si ; i++){
            subStr += str.charAt(i);
        }
        return subStr;
    }
    public static void main(String args[]){
        String str  = "HelloWorld";
        System.out.println(subString(str, 0, 5));

    }
    
}
