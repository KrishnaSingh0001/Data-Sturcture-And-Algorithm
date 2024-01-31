//{ Driver Code Starts
//Initial template for JAVA

import java.lang.*;
import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function template for JAVA

class Solution
{
    public static boolean checkPangram  (String s) {
        boolean[] avilable = new boolean[26];
        for(int i=0;i<s.length();i++){
            if(Character.isLetter(s.charAt(i))){
                int idx = Character.toLowerCase(s.charAt(i)) - 'a';
                avilable[idx] = true;
            }
        }
        for(boolean bool : avilable){
            if(!bool)
                return false;
        }
        return true;
    }
}

//{ Driver Code Starts.

class GFG
 {
	public static void main (String[] args) throws IOException
	 {
	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	  int t=Integer.parseInt(br.readLine());
	  while(t-->0)
	  {
	    String s=br.readLine().trim();
	    
	    System.out.println(new Solution().checkPangram (s)==true?1:0);
	  }
	  
	 }
}
// } Driver Code Ends