//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);
        
        return a;
    }
    
    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
    
    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine().trim());
        while(t-- > 0){
            
            int n; 
            n = Integer.parseInt(br.readLine().trim());
            
            
            int[] price = IntArray.input(br, n);
            
            Solution obj = new Solution();
            int res = obj.maxProfit(n, price);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static int maxProfit(int n, int[] arr) {
        // code here
        int dp[][][] = new int[n+1][2][3];
        for(int i = 0; i <= n - 1; i++){
            for(int buy = 0; buy <= 1; buy++){
                dp[i][buy][0] = 0;
            }
        }
        for(int buy = 0; buy <= 1; buy++){
            for(int tran = 0; tran <= 2; tran++){
                dp[n][buy][tran] = 0;
            }
        }
        
        for(int i = n - 1; i >= 0;i--){
            for(int buy = 0; buy <= 1; buy++){
                for(int tran = 1; tran <= 2; tran++){
                     int profit = 0;
                     if(buy == 1){
                       profit =  Math.max(-arr[i] + dp[i+1][0][tran],0 + dp[i+1][1][tran]);
                     }else{
                       profit =  Math.max(arr[i] + dp[i+1][1][tran-1],0 + dp[i+1][0][tran]); 
                     }
                     dp[i][buy][tran] = profit;
                }
            }
        }
        return dp[0][1][2];
    }
}
        
