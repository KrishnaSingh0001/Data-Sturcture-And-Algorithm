//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(in.readLine());

            Solution ob = new Solution();
            List<Integer> ans = new ArrayList<Integer>();
            StringBuilder out = new StringBuilder();
            ans = ob.jugglerSequence(n);
            for (int i = 0; i < ans.size(); i++) out.append(ans.get(i) + " ");
            System.out.println(out);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static List<Integer> jugglerSequence(int n) {
        List<Integer> res = new ArrayList<Integer>();
        res.add(n);
        while(n != 1){
            if((n&1) == 1){
                n = (int)Math.floor(Math.pow(n, 1.5));
            }else{
                n = (int)Math.floor(Math.pow(n, 0.5));
            }
            res.add(n);
        }
        return res;
    }
}