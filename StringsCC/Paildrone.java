package StringsCC;

public class Paildrone {
    public static boolean isPaildrone(String str ){
        int n = str.length();
        for(int i = 0; i< str.length()/2 ; i++){
            if (str.charAt(i) == str.charAt(n-1-i)){
                return true;

            }
        }
        return false ;
    }
    public static void main(String args []){
        // String str = "racecar";
        String str = " Krishna";
        System.out.println(isPaildrone(str));
    }
    
}
