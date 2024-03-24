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
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            ArrayList<String> result = ob.NBitBinary(n);
            for(String value  : result){
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    ArrayList<String> NBitBinary(int N) {
        // code here
        ArrayList<String> res = new ArrayList<>();
        int ones = 0;
        int zeros = 0;
        String op = "";
        solve(ones, zeros, N, op,res);
        return res;
    }
    
    public void solve(int ones, int zeros, int N, String op, ArrayList<String> res) {
        if (N == 0) {
            res.add(op);
            return;
        }
        
        String op1 = op;
        op1 += "1";
        solve(ones + 1, zeros, N - 1, op1, res);
        
        if (ones > zeros) {
            String op2 = op;
            op2 += "0";
            solve(ones, zeros + 1, N-1, op2, res);
        }
        
        return;
    }
}