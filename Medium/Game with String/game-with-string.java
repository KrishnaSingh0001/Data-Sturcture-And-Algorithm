//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String s = in.readLine();
            int k = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            System.out.println(ob.minValue(s, k));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static int minValue(String s, int k){
        // code here
        Integer[] counts = new Integer[27];
        Arrays.fill(counts, 0);
        for (char c: s.toCharArray()) {
            counts[c - 'a']++;
        }
        Arrays.sort(counts, Comparator.reverseOrder());
        int res = 0;
        for (int i = 1; i < 27; i++) {
            int change = (counts[i - 1] - counts[i]) * i;
            if (k == 0) {
                res += Math.pow(counts[i - 1], 2);
            } else if (change >= k) {
                int one = counts[i - 1] - (int) Math.ceil(1.0 * k / i);
                int addi = k % i;
                if (addi == 0) addi = i;
                res += addi * Math.pow(one, 2) + (i - addi) * Math.pow(one + 1, 2);
                k = 0;
            } else {
                k -= change;
            }
        }
        return res;
    }
}