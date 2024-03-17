//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            String input[] = read.readLine().split(" ");
            String a = input[0];
            
            Solution ob = new Solution();
            if(ob.sameFreq(a)){
                System.out.println(1);
            }
            else{
                System.out.println(0);
            }
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    boolean sameFreq(String s) {
        int freq[] = new int[26];
        HashMap<Integer,Integer>map = new HashMap();
//get all chars frequency
        for(char c:s.toCharArray()) freq[c-'a']++;
//put all frequency in map
        for(int i:freq){
            if(i==0) continue;
            map.put(i,map.getOrDefault(i,0)+1);
        }
//all chars have same frequency so return true
        if(map.size()==1) return true;
//if there are more than 2 freq just return false
        if(map.size()>2) return false;
/*now we have 2 pairs in map[Frequency as Key, No of chars with that frequency as Value],
 just put that keys in a and b */
        int a = -1,b = -1;
        for(int i:map.keySet()){
            if(a==-1) a = i;
            else b = i;
        }
//we should have some frequency value as 1 if not return false 
        if(!(map.get(a)==1 || map.get(b)==1)) return false;
//check if absolute diff of both frequency is 1
        return Math.abs(a-b)<=1;
    }
}